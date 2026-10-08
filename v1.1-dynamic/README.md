# SBXRoleTextarea 1.1.1 – configurable multiline Role attributes

Built and tested 2026-10-01 on IdentityIQ **8.0** (build `31069ce-20190529-143133`), Tomcat 9, Java 8.
Background, the root-cause analysis and the hard-coded 1.0.0 prototype are in `../README.md`.

**Superseded 2026-10-01:** the plugin was renamed to `RoleTextarea` 1.2.0 (source and docs in `../github-repo/iiq-role-textarea-plugin/`). In the sandbox `RoleTextarea` 1.2.0 is enabled and `SBXRoleTextarea` 1.1.1 is installed but disabled. This file is the 1.1.x record.

**Last SBX-named version: 1.1.1.** It differs from 1.1.0 only in who decides editability: see section 1a. Sections 4 and 5 are the 1.1.0 test record; the 1.1.1 re-tests are in section 5a.

**What it does.** An admin lists Role extended attribute names in the plugin's configuration (for example `commentsText,roleNotes`). In the classic Role Editor, only those attributes are edited in a `<textarea>`. Every other attribute stays exactly as IIQ renders it. No IIQ product files are modified.

---

## 1. Design

```
Plugins > Configure                  RoleEditor page (roleEditor.jsf)
  setting "multilineAttributes"        snippet ui/js/roleTextarea.js
        │  stored on the Plugin object          │ GET /plugin/rest/sbxroletextarea/config
        ▼                                       │ header X-XSRF-TOKEN
  RoleTextareaResource (plugin REST, @AllowAll) ◄┘
    - reads the setting (getSettingMultiString)
    - keeps only names that the Bundle ObjectConfig defines as a
      single-valued string (definition check only, no editability or rights)
    - returns {"multilineAttributes":[...], "rejected":{name: reason}}
        │
        ▼
  snippet swaps <input type="text"> -> <textarea> (same name) for those rows,
  and only where IIQ rendered an enabled text input
```

Why a REST class is needed: the built-in `/rest/plugins/{id}/settings` endpoint (used by `PluginHelper.retrieveSettings`) requires the `FullAccessPlugin` right. A role manager gets **401** from it (tested below), so the snippet cannot read plugin settings directly.

Why the server still checks the type: RoleEditor renders `int`, `long` and `date` attributes as `<input type="text">` too (`h:inputText id="intvalue"` / `id="longvalue"` and the Ext date field in `include/attributesEditorByCategory.xhtml`; live DOM: `sbxMaxMembers => INPUT[text]`, `sbxReviewDate => INPUT[text]+INPUT[text]`). The page alone cannot tell those from a string input, so the endpoint drops names that are not single-valued strings (logged at WARN). It does not look at editMode, allowed values, the user or any rights.

Fail-safe: if the config request fails, the snippet does nothing and the page stays stock.

## 1a. Authorization model (1.1.1)

The plugin contains **no permission logic** and adds no write path. IIQ decides who can open RoleEditor and which attributes are editable; the plugin only reshapes an input IIQ already rendered.

| Point | Evidence |
|---|---|
| No rights/capability checks in the plugin | `grep -i "authoriz\|RightAuthorizer\|Capabilit\|SPRight" src plugin` finds only the `@AllowAll` import/annotation and `rightRequired=""` on the snippet |
| The endpoint must carry *some* annotation | `sailpoint.rest.plugin.PluginResourceUtil.authorizeEndpoint()` throws `FORBIDDEN` with "No authorization annotation found on plugin resource" when neither method nor class is annotated. `@AllowAll` is the "any logged-in identity" choice; `@RequiredRight` / `@SystemAdmin` would restrict it |
| Authentication is still IIQ's | `/plugin/rest/*` sits behind `restAuthenticationFilter` and `restCsrfValidationFilter` (`WEB-INF/web.xml`). Unauthenticated `curl` → **401**. No/bad CSRF token → rejected |
| Readable without plugin-admin rights | `sbxRoleManager` (BusinessRoleAdministrator only): plugin endpoint **200**; built-in `/rest/plugins/{id}/settings` **401** (needs `FullAccessPlugin`, `sailpoint.rest.PluginResource`) |
| The endpoint is read-only | One `@GET`; it reads the setting and the cached Bundle `ObjectConfig`, returns attribute names, saves nothing |
| The snippet only converts what IIQ rendered | `roleTextarea.js`: `row.querySelector('input[type="text"]')`, skipped when missing, `disabled` or `readOnly`. It never creates a field where IIQ rendered text or a dropdown, and never enables anything |
| Saving is unchanged | The textarea reuses the input's `name`; the stock JSF decode and `sailpoint.web.AttributeEditBean.commit()` process it exactly like the original `h:inputText` |
| Page access is unchanged | The snippet is attached only to `/define/roles/modeler/roleEditor.jsf`. For an IT role, IIQ disables **Edit Role** for the business-role manager (screenshot 07); the plugin is not involved |

**What changed from 1.1.0.** In 1.1.0 the endpoint also rejected attributes with no editable `editMode` or with `allowedValues`. That was the plugin judging editability from the attribute definition. 1.1.1 removes both checks: such names are returned, and the rendered page decides. Result for a read-only or dropdown string attribute that is listed in the setting: accepted by the endpoint, left untouched in RoleEditor (test A3 below).

## 2. Source (as tested)

| File | Purpose |
|---|---|
| `plugin/manifest.xml` | Plugin definition: setting, REST resource, snippet |
| `src/com/sbx/roletextarea/rest/RoleTextareaResource.java` | REST endpoint `GET /plugin/rest/sbxroletextarea/config` |
| `plugin/ui/js/roleTextarea.js` | Snippet loaded only on `/define/roles/modeler/roleEditor.jsf` |
| `build.sh` | Compiles against the sandbox IIQ jars, builds `dist/SBXRoleTextarea-<version>.zip` |
| `install.sh` | `plugin upgrade` / `plugin install` through the IIQ console |

### manifest.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE Plugin PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Plugin name="SBXRoleTextarea" displayName="SBX Role Extended Attribute Textarea" version="1.1.1" minSystemVersion="8.0" certificationLevel="None">
  <Attributes>
    <Map>
      <entry key="settings">
        <value>
          <List>
            <Setting name="multilineAttributes" dataType="string" multiValue="true"
                     label="Multiline Role attributes"
                     helpText="Names (ObjectAttribute name, not display name) of Role extended String attributes to edit as a textarea in the Role Editor. Only single-valued String attributes are accepted; an attribute is converted only where the Role Editor shows it as an editable text input."/>
          </List>
        </value>
      </entry>
      <entry key="restResources">
        <value>
          <List>
            <String>com.sbx.roletextarea.rest.RoleTextareaResource</String>
          </List>
        </value>
      </entry>
      <entry key="snippets">
        <value>
          <List>
            <Snippet regexPattern="/define/roles/modeler/roleEditor\.jsf" rightRequired="">
              <Scripts>
                <String>ui/js/roleTextarea.js</String>
              </Scripts>
            </Snippet>
          </List>
        </value>
      </entry>
    </Map>
  </Attributes>
</Plugin>
```

### RoleTextareaResource.java (core)

```java
@Path("sbxroletextarea")
@Produces(MediaType.APPLICATION_JSON)
public class RoleTextareaResource extends BasePluginResource {

    public static final String PLUGIN_NAME = "SBXRoleTextarea";
    public static final String SETTING_MULTILINE_ATTRIBUTES = "multilineAttributes";

    @Override
    public String getPluginName() {
        return PLUGIN_NAME;
    }

    @GET
    @Path("config")
    @AllowAll
    public Map<String, Object> getConfig() {
        List<String> accepted = new ArrayList<>();
        Map<String, String> rejected = new LinkedHashMap<>();

        List<String> configured = getSettingMultiString(SETTING_MULTILINE_ATTRIBUTES);
        ObjectConfig roleConfig = ObjectConfig.getObjectConfig(Bundle.class);

        if (configured != null) {
            for (String raw : configured) {
                String name = (raw == null) ? "" : raw.trim();
                if (name.isEmpty() || accepted.contains(name)) {
                    continue;
                }
                String reason = getRejectReason(roleConfig, name);
                if (reason == null) {
                    accepted.add(name);
                } else {
                    rejected.put(name, reason);
                    log.warn(PLUGIN_NAME + ": ignoring multiline attribute '" + name + "': " + reason);
                }
            }
        }

        Map<String, Object> result = new LinkedHashMap<>();
        result.put("multilineAttributes", accepted);
        result.put("rejected", rejected);
        return result;
    }

    private static String getRejectReason(ObjectConfig roleConfig, String name) {
        ObjectAttribute attr = (roleConfig == null) ? null : roleConfig.getObjectAttribute(name);
        if (attr == null) {
            return "not a Role extended attribute";
        }
        String type = attr.getType();
        if (type != null && !ObjectAttribute.TYPE_STRING.equals(type)) {
            return "type is " + type + ", not string";
        }
        if (attr.isMulti()) {
            return "is multi-valued";
        }
        return null;
    }
}
```

The full file, with imports and comments, is in `src/`.

### roleTextarea.js

See `plugin/ui/js/roleTextarea.js`. Compared with 1.0.0:

* The hard-coded `MULTILINE_ATTRS` array is gone. The list comes from `PluginHelper.getPluginRestUrl('sbxroletextarea/config')`, with the header `X-XSRF-TOKEN: PluginHelper.getCsrfToken()`.
* `id` is only copied to the textarea when the input has one.
* 1.1.1: the input is skipped when it is `disabled` or `readOnly`.
* Nothing happens when the list is empty or the request fails.

## 3. Build / install / configure

```bash
./build.sh              # -> dist/SBXRoleTextarea-1.1.1.zip (manifest.xml, ui/js/roleTextarea.js, lib/sbx-roletextarea.jar)
./install.sh            # plugin upgrade   |  ./install.sh install  for a fresh system
```

`build.sh` compiles with `javac -source 1.8 -target 1.8` against `identityiq.jar`, `jaxrs-ri-2.22.2.jar` and `commons-logging-1.2.jar` from the IIQ `WEB-INF/lib` (override with `IIQ_LIB=...`).

Manual console equivalent:

```
plugin upgrade /Users/pujanbohora/Documents/IIQ-Role-Textarea-Test/v1.1-dynamic/dist/SBXRoleTextarea-1.1.1.zip
```

It can also be installed through the UI: Gear → Plugins → New.

**After a console upgrade that changes Java code, reload the plugin in the running server.** Observed on 1.1.0 → 1.1.1: within a minute the new JS was served, but the REST endpoint kept answering with the old class. Cause (decompiled `sailpoint.server.PluginSyncService`): its `load()`/`reload()` only request a REST container reload when `plugin.hasServiceExecutorClassNames()`, which this plugin does not have. Fix that worked: Gear → Plugins → **disable, then enable** the plugin (the setting is kept). Installing/upgrading through the Plugins UI or restarting the app server should avoid this, but was not tested.

**Configure** (needs the `FullAccessPlugin` right, e.g. SystemAdministrator or PluginAdministrator):

1. Gear → **Plugins** → *SBX Role Extended Attribute Textarea* → **Configure**.
2. In **Multiline Role attributes** enter the attribute **names** separated by commas, e.g. `commentsText,roleNotes`.
3. **Save**. The change is effective on the next RoleEditor page load. No rebuild, upgrade or restart is needed.

What happens to a listed name:

* It must be a single-valued `type="string"` Role attribute, otherwise the endpoint drops it.
* It becomes a textarea only where IIQ renders it as an editable text input. For that IIQ needs `editMode="Permanent"` (or `UntilFeedValueChanges`) and no allowed values; a read-only or dropdown attribute is simply left as IIQ shows it.

To check what the plugin accepted, call the endpoint from the browser console on any classic IIQ page:

```js
fetch('/identityiq/plugin/rest/sbxroletextarea/config', {headers: {'X-XSRF-TOKEN': PluginHelper.getCsrfToken()}}).then(r => r.json()).then(console.log)
```

## 4. Test setup

Bundle ObjectConfig test attributes (`sandbox-objects/Bundle-ObjectConfig-v1.1-test.xml`):

| Attribute | Definition | Purpose |
|---|---|---|
| `sbxKommentarsText` | string, Permanent | configured → textarea |
| `sbxRoleNotes` | string, Permanent | configured → textarea |
| `sbxSingleLineNote` | string, Permanent | not configured → normal input |
| `sbxPriority` | string, Permanent, allowedValues Low/Medium/High | dropdown; listed on purpose → must be rejected |
| `sbxReadOnlyNote` | string, no editMode | read-only; listed on purpose → must be rejected |
| `sbxReviewDate` | date, Permanent | listed on purpose → must be rejected |
| `sbxCritical` | boolean, Permanent | unchanged |
| `sbxMaxMembers` | int, Permanent | unchanged |

* Role: `SBX Textarea Test Role` (business). Values were seeded by the rule `SBX Seed v1.1 Values`.
* Non-admin user: `sbxRoleManager`, capability **BusinessRoleAdministrator** only. It was created by the rule `SBX Set RoleManager Password`; the password is in `TEST-CREDENTIALS.txt`.

## 5. Test results for 1.1.0 (all executed in the sandbox UI)

| # | Test | Result |
|---|---|---|
| 1 | Build with `build.sh` | ✅ compiles cleanly; zip contains manifest, JS, `lib/sbx-roletextarea.jar` |
| 2 | `plugin upgrade` 1.0.0 → 1.1.0 from the console, Tomcat not restarted | ✅ `SBXRoleTextarea 1.1.0 Enabled`; the REST class (new in this version) was available without a restart |
| 3 | REST with a valid CSRF token, setting empty | ✅ `200 {"multilineAttributes":[],"rejected":{}}`; RoleEditor unchanged |
| 4 | REST without a token, and with a bogus token | ✅ rejected. Redirect to `exception.jsf`; `catalina.out`: `CsrfValidationException: CSRF validation failed` at `RestCsrfValidationFilter` |
| 5 | Plugin configuration UI | ✅ label and help text shown; one text field. Entered `sbxKommentarsText, sbxRoleNotes,sbxPriority,sbxReadOnlyNote,sbxReviewDate,sbxDoesNotExist` → "Plugin Configuration successfully saved." The UI removed the space after the comma. Stored on the Plugin object as `value="a,b,..."` |
| 6 | REST immediately after saving the config | ✅ accepted `["sbxKommentarsText","sbxRoleNotes"]`. Rejected: `sbxPriority` "has allowedValues (rendered as a dropdown)", `sbxReadOnlyNote` "not editable…", `sbxReviewDate` "type is date, not string", `sbxDoesNotExist` "not a Role extended attribute" |
| 7 | RoleEditor widgets (spadmin) | ✅ `sbxKommentarsText` TEXTAREA, `sbxRoleNotes` TEXTAREA, `sbxSingleLineNote` INPUT text, `sbxMaxMembers` INPUT text, `sbxCritical` checkbox, `sbxReviewDate` date picker, `sbxPriority` SELECT, `sbxReadOnlyNote` plain text (screenshot 03) |
| 8 | Multiline save: typed a new line in both textareas, changed the single-line, int and dropdown fields, Submit | ✅ "successfully saved". Stored: `sbxKommentarsText` 3 lines, `sbxRoleNotes` 4 lines (CRLF), `sbxSingleLineNote="Single line edited"`, `sbxMaxMembers=43`, `sbxPriority=High`. `sbxReadOnlyNote` unchanged, with its `\n` intact |
| 9 | Reopen the role | ✅ both textareas show all lines |
| 10 | Change the config **without rebuilding**: `sbxKommentarsText,sbxSingleLineNote` | ✅ on the next RoleEditor load: `sbxKommentarsText` TEXTAREA, `sbxSingleLineNote` TEXTAREA, `sbxRoleNotes` back to INPUT. Config then set back to `sbxKommentarsText,sbxRoleNotes` |
| 11 | Non-admin `sbxRoleManager` (BusinessRoleAdministrator): REST | ✅ plugin endpoint `200` with the list. Built-in `/rest/plugins/{id}/settings` → **401** (confirms the REST class is needed) |
| 12 | Non-admin: RoleEditor | ✅ same widgets as spadmin (screenshot 05). Added "Notes line 5 by sbxRoleManager", Submit → saved; stored `sbxRoleNotes` has 5 lines |
| 13 | Role Type changed Business → IT in the editor (not saved) | Textareas stayed. The attribute table was not re-rendered by this change, so the MutationObserver re-apply path was **not exercised** |

## 5a. Re-tests for 1.1.1

| # | Test | Result |
|---|---|---|
| A1 | `plugin upgrade` 1.1.0 → 1.1.1 from the console | ✅ `SBXRoleTextarea 1.1.1 Enabled`; the setting value `sbxKommentarsText,sbxRoleNotes` survived the upgrade. ⚠️ The REST class was **not** reloaded until the plugin was disabled and re-enabled in the UI (see section 3) |
| A2 | Config `sbxKommentarsText,sbxRoleNotes,sbxReadOnlyNote,sbxPriority,sbxReviewDate,sbxMaxMembers,sbxDoesNotExist`; REST as spadmin | ✅ accepted `sbxKommentarsText, sbxRoleNotes, sbxReadOnlyNote, sbxPriority`; rejected `sbxReviewDate` "type is date, not string", `sbxMaxMembers` "type is int, not string", `sbxDoesNotExist` "not a Role extended attribute" |
| A3 | RoleEditor with that config (spadmin) | ✅ `sbxKommentarsText` TEXTAREA, `sbxRoleNotes` TEXTAREA; `sbxReadOnlyNote` still plain text, `sbxPriority` still SELECT (both listed and accepted, but not rendered as a text input, so untouched); `sbxSingleLineNote` INPUT, `sbxMaxMembers` INPUT, `sbxReviewDate` date field, `sbxCritical` checkbox (screenshot 06) |
| A4 | Unauthenticated `curl` to the endpoint | ✅ 401 |
| A5 | `sbxRoleManager`: REST and RoleEditor on the business test role | ✅ endpoint 200 with the same list; built-in settings endpoint 401; same widgets as spadmin |
| A6 | `sbxRoleManager` selects an IT role | ✅ IIQ disables **Edit Role** and **Delete**; nothing from the plugin on that page (screenshot 07) |

| A7 | Disable the plugin in the UI, open RoleEditor (spadmin) | ✅ snippet not loaded, endpoint 404, `sbxKommentarsText` and `sbxRoleNotes` are stock INPUTs (not saved) |
| A8 | Re-enable the plugin | ✅ endpoint 200 with `sbxKommentarsText,sbxRoleNotes`; setting kept |
| A9 | Final multiline save on 1.1.1 as `sbxRoleManager`: typed a new line into both textareas with the keyboard, Submit | ✅ "successfully saved". Stored: `sbxKommentarsText` 4 lines, `sbxRoleNotes` 6 lines (CRLF); `sbxReadOnlyNote` still `RO line 1\nRO line 2` |
| A10 | Reopen as `sbxRoleManager` | ✅ textareas show 4 and 6 lines |

The config was set back to `sbxKommentarsText,sbxRoleNotes` after A3. The publishable repository is in `../github-repo/iiq-role-textarea-plugin/`; its JDK 8 build is byte-identical (class, manifest, JS) to `dist/SBXRoleTextarea-1.1.1.zip`.

Final stored values are in `sandbox-objects/live-export/Bundle-SBX-Textarea-Test-Role-CURRENT.xml`.

## 6. Caveats

* **Removing an attribute from the list brings back the stock data-loss behaviour.** In test 10, `sbxRoleNotes` came back as `<input type="text">`: the stored value still had its line breaks, but the visible value was already flattened. Saving the role in that state would wipe the newlines. (It was not saved.) The same applies if the plugin is disabled or uninstalled, or the config request fails. Only remove attributes whose values no longer need line breaks.
* Line breaks typed in the textarea are stored as **CRLF** (`\r\n`); values set by import or a rule may have `\n`.
* The textarea appears after the config request returns, so the single-line input can be visible for a moment on page load.
* The Role Viewer and other read-only displays still collapse line breaks (deliberately out of scope for now).
* `@AllowAll` means any authenticated user can read the list of attribute names. Nothing else is exposed.
* A console upgrade does not reload changed REST classes in the running server (see section 3).
* In a cluster, a settings change reaches other nodes through the PluginSync service (interval 60 s). Only a single node was tested here.
* The snippet depends on IIQ 8.0 markup (`#roleAttributeEditorTable`, hidden `span.attributeName`). Re-test after upgrades.
* The plugin configuration UI does not validate the names. Use the REST call in section 3 to see the accepted and rejected names; rejected names are also logged at WARN.

## 7. Objects in the sandbox after this round (left in place)

| Object | State |
|---|---|
| Plugin `SBXRoleTextarea` | **1.1.1, Enabled**, setting `multilineAttributes = sbxKommentarsText,sbxRoleNotes` |
| ObjectConfig `Bundle` | 8 `sbx*` test attributes (see section 4) |
| Bundle `SBX Textarea Test Role` | values as in `live-export/` |
| Identity `sbxRoleManager` | new; BusinessRoleAdministrator; test password in `TEST-CREDENTIALS.txt` |
| Rule `SBX Seed v1.1 Values` | new |
| Rule `SBX Set RoleManager Password` | new (contains the test password in clear text) |
| Rule `SBX Restore Kommentar` | from 1.0.0, unchanged |

No IIQ product files were changed and Tomcat was not restarted. The browser pane is logged in as spadmin again.

Full revert (not run): `../scripts/revert-sandbox.sh` uninstalls the plugin, restores the original Bundle ObjectConfig, and deletes the test role, the three rules and `sbxRoleManager`.

## 8. Files

```
v1.1-dynamic/
├── README.md
├── build.sh / install.sh / import-test-objects.sh
├── TEST-CREDENTIALS.txt                      sbxRoleManager test password (local sandbox only, chmod 600)
├── plugin/
│   ├── manifest.xml
│   └── ui/js/roleTextarea.js
├── src/com/sbx/roletextarea/rest/RoleTextareaResource.java
├── dist/
│   ├── SBXRoleTextarea-1.1.1.zip             built and installed (current)
│   └── SBXRoleTextarea-1.1.0.zip             previous build
├── sandbox-objects/
│   ├── Bundle-ObjectConfig-v1.1-test.xml
│   ├── SBX-Seed-v1.1-Values-Rule.xml
│   ├── SBX-Set-RoleManager-Password-Rule.xml (chmod 600)
│   └── live-export/                          exported from IIQ after testing
│       ├── ObjectConfig-Bundle-CURRENT.xml
│       ├── Bundle-SBX-Textarea-Test-Role-CURRENT.xml
│       ├── Plugin-SBXRoleTextarea-CURRENT.xml
│       ├── Rule-SBX-Seed-v1.1-Values-CURRENT.xml
│       └── SBXRoleTextarea-1.1.1-exported-from-IIQ.zip
└── screenshots/
    ├── 01-plugin-config-ui-empty.jpg
    ├── 02-plugin-config-ui-list-entered.jpg
    ├── 03-roleeditor-spadmin-two-textareas.jpg
    ├── 04-roleeditor-after-typing.jpg
    ├── 05-roleeditor-as-sbxRoleManager.jpg
    ├── 06-v1.1.1-readonly-and-dropdown-configured-but-untouched.jpg
    └── 07-v1.1.1-rolemanager-IT-role-edit-disabled-by-IIQ.jpg
```
