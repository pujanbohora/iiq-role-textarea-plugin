# IIQ Role Extended Attribute as Multiline Textarea – Investigation

Investigation date: 2026-09-29 – 2026-10-01
Sandbox: local IdentityIQ under `/Users/pujanbohora/Documents/Developer/apache-tomcat-9.0.104/webapps/identityiq`

> **Update 2026-10-01 – version 1.1.1 (configurable).** The plugin was upgraded in the sandbox to **1.1.1**: the list of multiline attributes is now a plugin setting (Plugins → Configure) served to the page by a small plugin REST endpoint. Source, build, configuration instructions and test results are in [`v1.1-dynamic/README.md`](v1.1-dynamic/README.md). The 1.0.0 material below is kept as the original investigation record. The sandbox now also contains more `sbx*` test attributes, the user `sbxRoleManager` and two more rules; `scripts/revert-sandbox.sh` was updated to cover them.

**Summary.** ObjectConfig alone **cannot** make a Role (Bundle) extended String attribute a textarea in the classic RoleEditor. In IIQ 8.0 the JSF template has no textarea branch for extended attributes. The stock single-line input also **silently destroys** newlines already stored in the value. A small plugin snippet that swaps the `<input>` for a `<textarea>` works end to end, with no product files changed.

---

## 1. IIQ version tested

| Item | Value |
|---|---|
| IdentityIQ | **8.0** – build `31069ce-20190529-143133` |
| System version | 8.0-28 |
| Schema version | 8.0-09 |
| App server | Apache Tomcat 9.0.104 |
| Java | Temurin 8 (1.8.0_462) |
| Database | MySQL 8.0, schema `identityiq` |
| `iiq.properties` | `plugins.enabled=true`, `plugins.angularSnippetEnabled=false` |
| Browser used for UI tests | Chromium (Claude desktop app browser pane), logged in as `spadmin` |

## 2. Original forum requirement

A Role/Bundle extended attribute appears in the RoleEditor as a single-line input:

```
Kommentars Text: [________________________]
```

The user wants it to be a **multiline textarea**, like the role Description field, so that line breaks can be entered.

## 3. How Role extended attributes are rendered

The chain in the classic Role Editor (`/define/roles/modeler/roleEditor.jsf`) is:

1. `define/roles/modeler/roleEditor.xhtml` (≈ line 284):
   ```xml
   <p:outputPanel id="attributesPanel">
     <ui:include src="/include/attributeEditor.xhtml">
       <ui:param name="tableId" value="roleAttributeEditorTable"/>
       <ui:param name="formName" value="editForm"/>
       <ui:param name="attributeEditor" value="#{roleEditor.attributeEditor}"/>
       ...
   ```
2. `include/attributeEditor.xhtml` groups the attributes by category and includes
3. `include/attributesEditorByCategory.xhtml` once per category. That template picks the widget **by `type` only**. For a string attribute it has exactly these branches:

   ```xml
   <!-- editable, no allowed values  -> single-line input -->
   <ui:fragment rendered="#{(attributeDefinition.type == null or attributeDefinition.type == 'string') and attributeDefinition.editable and (empty attributeDefinition.allowedValues)}">
     <h:inputText style="width:275px" value="#{attributeEditor.attributes[attributeDefinition.name]}"/>
   </ui:fragment>
   <!-- editable, allowed values     -> dropdown -->
   <ui:fragment rendered="#{(attributeDefinition.type == null or attributeDefinition.type == 'string') and attributeDefinition.editable and !(empty attributeDefinition.allowedValues)}">
     <h:selectOneMenu value="#{attributeEditor.attributes[attributeDefinition.name]}">
       <f:selectItems value="#{attributeDefinition.allowedValuesSelectItems}"/>
     </h:selectOneMenu>
   </ui:fragment>
   <!-- not editable                 -> plain text -->
   <ui:fragment rendered="#{(attributeDefinition.type == null or attributeDefinition.type == 'string') and !attributeDefinition.editable}">
     <h:outputText value="#{attributeEditor.attributes[attributeDefinition.name]}"/>
     ...
   ```
   Other branches exist for `sailpoint.object.Identity`, `secret`, `long`, `int`, `boolean`, `date` and `sailpoint.object.Rule`. **None of them renders a `<textarea>`.**

   Each row also carries a hidden `<span class="attributeName" style="display:none">attrName</span>`, which the plugin uses to find the right row.

### Editable vs read-only: `editMode` is required

`attributeDefinition.editable` comes from `sailpoint.web.system.ObjectAttributeDTO.isEditable()` (decompiled):

```java
public boolean isEditable() {
    return this._editMode != null && !this._editMode.equals(ObjectAttribute.EditMode.ReadOnly.toString());
}
```

`_editMode` is copied from `ObjectAttribute.getEditMode()` only when it is non-null. So **an ObjectAttribute without `editMode` is read-only in RoleEditor** and is rendered with `h:outputText`. Valid values are `ReadOnly`, `Permanent` and `UntilFeedValueChanges`. Roles have no feed, so `Permanent` is the natural choice.

This is why the attribute first showed as `SBX Kommentars Text   Line one Line two Line three`. HTML collapses the newlines to spaces.

Note also that the **Role Viewer** tab (`roleTabs.jsf`, "Extended Attributes" panel) is always read-only and shows the value as plain text with newlines collapsed.

## 4. Relevant XHTML / JS / classes investigated

| File / class | Relevance |
|---|---|
| `define/roles/modeler/roleEditor.xhtml` | Role Editor page. Description `<div id="roleDescriptionHTML">` + hidden `editForm:jfDescriptionsJSON`; includes the attribute editor. Uses template `ngAppPage.xhtml`, which loads plugin snippets. |
| `include/attributeEditor.xhtml` | Groups extended attributes by category. |
| `include/attributesEditorByCategory.xhtml` | **Actual widget selection**: string → `h:inputText` / `h:selectOneMenu` / `h:outputText`. |
| `scripts/sailpoint/web/define/modeler/roleEditor.js` (lines 95–104, 153–158) | Builds the Description editor and copies its value back on save. |
| `scripts/sailpoint/form/HtmlEditor.js`, `MultiLanguageHtmlEditor.js` | The rich-text (ExtJS HtmlEditor) used for Description. |
| `scripts/sailpoint/attributeEditor.js` | `SailPoint.initAttributeEditor()`: only decorates date and identity fields. |
| `sailpoint.web.AttributeEditBean` | Backing bean. `commit()` copies posted values into `obj.getExtendedAttributes()` **unchanged** (no trim, no newline stripping). |
| `sailpoint.web.system.ObjectAttributeDTO` | DTO the template renders; `isEditable()` logic above. No display-type property. |
| `sailpoint.object.ObjectAttribute` / `BaseAttributeDefinition` | XML-serialisable properties of an ObjectAttribute (see §6). |
| `sailpoint.web.modeler.RoleEditorBean` | Owns `attributeEditor` and `descriptionsJSON`. |

The decompiled sources (CFR 0.152) are in `decompiled-reference/`. They are **SailPoint proprietary code, for local reference only – do not publish.**

## 5. Why `description` behaves differently

Description does **not** go through the attribute editor template at all, and it is **not a textarea**:

```xml
<!-- roleEditor.xhtml -->
<div id="roleDescriptionHTML"/>
<h:inputHidden value="#{roleEditor.descriptionsJSON}" id="jfDescriptionsJSON" escape="false"/>
```

```js
// roleEditor.js
if (Ext.getDom('roleDescriptionHTML') && Ext.getDom("editForm:jfDescriptionsJSON")) {
    var descriptionEditor = new SailPoint.MultiLanguageHtmlEditor({
        renderTo: 'roleDescriptionHTML',
        width: 500,
        height: 200,
        languageJSON: Ext.getDom("editForm:jfDescriptionsJSON").value,
        id: 'roleDescriptionHTMLCmp',
        ...
    });
}
...
function saveRoleEditor() {
    var roleDescriptionCmp = Ext.getCmp('roleDescriptionHTMLCmp');
    if (roleDescriptionCmp) {
        Ext.getDom('editForm:jfDescriptionsJSON').value = roleDescriptionCmp.getCleanValue();
    }
}
```

It is an ExtJS **rich-text HTML editor** (bold/italic/underline/lists, language selector, 1024-char counter "including markup"). The value is stored as HTML per locale in `Bundle.attributes.sysDescriptions`.

Verified live: pressing **Enter** in Description produces `<br>`, not a newline character:

```
getCleanValue() -> [{"isDefault":true,"displayName":"English","locale":"en_US",
                     "value":"Line A of description Line B of description<br>Line C typed"}]
```

A plain `\n` in an imported description (`Line A of description\nLine B of description`) was displayed **and re-saved** as a space. So Description supports "line breaks" because it is HTML, not because it is a multiline text field. (That test edit was discarded, not saved.)

## 6. Why ObjectConfig alone cannot create a textarea

* The template selects the widget only by `type`, `editable` and whether `allowedValues` is empty (§3). There is no branch that emits `<textarea>`.
* `ObjectAttribute` in 8.0 has **no `<Attributes>` map**, so there is nowhere to put a custom display hint. Its XML-serialised properties are: `name`, `displayName`, `type`, `multi`, `description`, `categoryName`, `required`, `defaultValue`, `allowedValues`, `editMode`, `system`, `standard`, `silent`, `extendedNumber`, `namedColumn`, `external`, `groupFactory`, `rule`, `sources`, `targets`, `listenerRule`, `listenerWorkflow`.
* `ObjectAttributeDTO` exposes no display-type/format property either.
* Valid types (`BaseAttributeDefinition` / `PropertyInfo` constants): `string`, `secret`, `long`, `int`, `boolean`, `date`, `permission`, `complex`, `script`, `sailpoint.object.Rule`, `sailpoint.object.Identity`, scope, application, role, managed attribute. There is no `text`, `clob` or `textarea` type.
* Of the properties above, only `editMode` (read-only vs input) and `allowedValues` (input vs dropdown) change the widget. Both were tried in this sandbox: `editMode` absent → read-only text; `editMode="Permanent"` → 275px `<input type="text">`.

ObjectConfig XML gotcha found along the way: `<ObjectAttribute>` elements are **direct children of `<ObjectConfig>`**. A wrapping `<ObjectAttributes>` element is rejected by the DTD (`Element type "ObjectAttributes" must be declared`).

## 7. Newline storage test results

| Method | Result |
|---|---|
| XML import of the role with `value="Line one&#10;Line two&#10;Line three"` | Stored with newlines (`&#xA;` in the exported XML). ✅ |
| BeanShell rule `b.setAttribute("sbxKommentarsText", "Line one\nLine two\nLine three")` | Stored with newlines; rule returned the 3-line string. ✅ |
| Server side of RoleEditor save (`AttributeEditBean.commit()`) | Copies posted string verbatim: `destAttributes.put(name, editedAttributes.get(name))`. ✅ |

**The extended String attribute can store newlines.** The attribute is non-searchable (no `extendedNumber`), so it lives in the `attributes` CLOB of `spt_bundle`.

## 8. Stock RoleEditor newline data-loss test

Setup: `editMode="Permanent"`, value stored as `Line one\nLine two\nLine three`, no plugin installed.

DOM inspection of the rendered field:

```json
{
  "outer":        "<input type=\"text\" name=\"editForm:attributes:0:j_idt277\" value=\"Line one\nLine two\nLine three\" style=\"width:275px\">",
  "attr":         "Line one\nLine two\nLine three",
  "defaultValue": "Line one\nLine two\nLine three",
  "value":        "Line oneLine twoLine three"
}
```

The server sends the newlines in the `value` attribute, but the browser's value-sanitisation for `<input type="text">` **strips line breaks** from the live `.value`. The field visually showed `Line oneLine twoLine three`.

Then I opened the role in RoleEditor and clicked **Submit without changing anything**. The role saved directly ("The role named 'SBX Textarea Test Role' was successfully saved."; no approval workflow). Stored value afterwards:

```xml
<entry key="sbxKommentarsText" value="Line oneLine twoLine three"/>
```

⚠️ **Data loss:** any multiline value set by import, rule or API is flattened, with words run together, the next time anyone saves the role in the stock RoleEditor. The plain-text description newline was likewise turned into a space.

## 9. Plugin implementation

A plugin `SBXRoleTextarea` with a single **page snippet**. There is no Java, no REST, no DB scripts and no product files changed.

* The snippet is attached only to `/define/roles/modeler/roleEditor.jsf` (the regex is a full match on the servlet path).
* `roleEditor.xhtml` uses `ngAppPage.xhtml`, which includes `include/plugins.xhtml`, so snippets are loaded there. Plain JS snippets load even with `plugins.angularSnippetEnabled=false`.
* The JS finds the row via the hidden `span.attributeName`, replaces the `<input type="text">` with a `<textarea>` that has the **same `name`** (so the JSF decode still binds it to `attributeEditor.attributes[...]`), and fills it from `input.defaultValue`, which still holds the newlines.
* A `MutationObserver` re-applies the swap if PrimeFaces re-renders `attributesPanel` via AJAX. After the swap there is no text input left in that row, so it doesn't loop.

### `plugin/SBXRoleTextarea/manifest.xml` (as tested)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE Plugin PUBLIC "sailpoint.dtd" "sailpoint.dtd">
<Plugin name="SBXRoleTextarea" displayName="SBX Role Extended Attribute Textarea" version="1.0.0" minSystemVersion="8.0" certificationLevel="None">
  <Attributes>
    <Map>
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

### `plugin/SBXRoleTextarea/ui/js/roleTextarea.js` (as tested)

```js
/*
 * Turns selected Role (Bundle) extended String attributes into <textarea>s
 * in the classic RoleEditor. Keeps the input's name/id so JSF binds it
 * exactly like the original h:inputText.
 */
(function () {
    // Extended attribute names (ObjectAttribute @name) to render multiline
    var MULTILINE_ATTRS = ['sbxKommentarsText'];

    function convert() {
        var table = document.getElementById('roleAttributeEditorTable');
        if (!table) {
            return;
        }
        var spans = table.querySelectorAll('span.attributeName');
        for (var i = 0; i < spans.length; i++) {
            var name = spans[i].textContent;
            if (MULTILINE_ATTRS.indexOf(name) < 0) {
                continue;
            }
            var row = spans[i].parentNode.parentNode;
            var input = row.querySelector('input[type="text"]');
            if (!input) {
                continue;
            }
            var ta = document.createElement('textarea');
            ta.name = input.name;
            ta.id = input.id;
            ta.rows = 6;
            ta.style.width = '500px';
            // defaultValue reflects the raw value attribute; .value has had
            // its line breaks stripped by the browser for type=text
            ta.value = input.defaultValue;
            input.parentNode.replaceChild(ta, input);
        }
    }

    function init() {
        convert();
        // RoleEditor re-renders attributesPanel via PrimeFaces ajax (e.g. on
        // role type change), so re-apply whenever the table is replaced
        new MutationObserver(convert).observe(document.body, {childList: true, subtree: true});
    }

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', init);
    } else {
        init();
    }
})();
```

To make other attributes multiline, add their ObjectAttribute `name`s to `MULTILINE_ATTRS`, bump the manifest `version`, rebuild and `plugin upgrade`.

Known cosmetic nit (left as tested): the JSF input has no `id`, so the textarea gets `id=""`. It's harmless; a production version would only copy `id` when it is set.

## 10. End-to-end plugin test results

1. The value was reset to `Line one\nLine two\nLine three` via the `SBX Restore Kommentar` rule.
2. Installed the plugin with `plugin install` and waited ~60 s for `PluginSync`.
3. Opened the role in RoleEditor. The script was loaded:
   `/identityiq/plugin/SBXRoleTextarea/ui/js/roleTextarea.js?31069ce-20190529-143133`
4. Rendered field:
   ```json
   { "outer": "<textarea name=\"editForm:attributes:0:j_idt277\" id=\"\" rows=\"6\" style=\"width: 500px;\"></textarea>",
     "value": "Line one\nLine two\nLine three" }
   ```
   It showed visually as three lines in a 500px × 6-row textarea.
5. Clicked into it, pressed **Enter** (this added a line; it did **not** submit the form) and typed `Line four typed in UI`. The textarea value was then `Line one\nLine two\nLine three\nLine four typed in UI`.
6. Clicked **Submit**: "successfully saved".
7. Stored value from the console:
   ```xml
   <entry key="sbxKommentarsText" value="Line one&#xD;&#xA;Line two&#xD;&#xA;Line three&#xD;&#xA;Line four typed in UI"/>
   ```
   ✅ Newlines preserved. Note that browsers submit textarea line breaks as **CRLF** (`\r\n`) per the HTML spec. Anything that consumes the attribute (emails, reports, rules) should handle `\r\n`.

Not covered by the plugin: the **Role Viewer** "Extended Attributes" panel and other read-only displays still collapse the newlines. A similar snippet on `/define/roles/roleTabs\.jsf` adding `white-space: pre-line` could address that; it was not implemented or tested.

## 11. How to build / install / uninstall the plugin

The helper scripts are in `scripts/`. They use Temurin 8 and the sandbox `WEB-INF/bin/iiq console`; paths are set in `scripts/env.sh`.

```bash
./scripts/build.sh                 # -> dist/SBXRoleTextarea.zip
./scripts/install.sh               # plugin install dist/SBXRoleTextarea.zip
./scripts/install.sh upgrade       # after bumping version in manifest.xml
./scripts/uninstall.sh             # plugin uninstall SBXRoleTextarea
```

Equivalent manual commands:

```bash
cd plugin/SBXRoleTextarea && zip -r ../../dist/SBXRoleTextarea.zip manifest.xml ui -x '.*'
```

```bash
cd /Users/pujanbohora/Documents/Developer/apache-tomcat-9.0.104/webapps/identityiq/WEB-INF/bin
export JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home PATH=$JAVA_HOME/bin:$PATH
./iiq console
> plugin install /Users/pujanbohora/Documents/IIQ-Role-Textarea-Test/dist/SBXRoleTextarea.zip
> plugin list
> plugin uninstall SBXRoleTextarea
```

* A console install writes to the DB from another JVM. The `PluginSync` service propagates it to the running Tomcat within ~60 s, with no restart.
* The script URL's cache-buster is the IIQ build number, not the plugin version, so **hard-refresh** the browser after an upgrade or uninstall.
* Alternatively, install through the UI: gear menu → Plugins → New.

The prerequisite on the attribute itself is `editMode="Permanent"`; without it there is no input to convert.

## 12. Files changed / objects created in the sandbox

**No product files** (xhtml, js, jar, properties) were modified. All changes are IIQ objects:

| Object | Change | Current state (left in place) |
|---|---|---|
| `ObjectConfig` **Bundle** | Added `<ObjectAttribute displayName="SBX Kommentars Text" editMode="Permanent" name="sbxKommentarsText" type="string">` (non-searchable, no extended column) | Present |
| `Bundle` **SBX Textarea Test Role** (type `business`, owner spadmin) | Created | Present; `sbxKommentarsText` = 4 lines (CRLF), description = `Line A of description Line B of description` |
| `Rule` **SBX Restore Kommentar** | Created; BeanShell, resets the test value to 3 `\n` lines | Present |
| `Plugin` **SBXRoleTextarea** 1.0.0 | Installed (stored in DB) | Present, **Enabled** |

Tomcat was not restarted, and no other roles or objects were changed. The browser pane session (spadmin) was left logged in.

## 13. How to revert everything later

**Not executed. The sandbox was deliberately left as-is.** When needed:

```bash
./scripts/revert-sandbox.sh        # asks for confirmation first
```

which runs, in the IIQ console:

```
plugin uninstall SBXRoleTextarea
import /Users/pujanbohora/Documents/IIQ-Role-Textarea-Test/sandbox-objects/import/Bundle-ObjectConfig-ORIGINAL.xml
delete Bundle "SBX Textarea Test Role"
delete Rule "SBX Restore Kommentar"
```

* `Bundle-ObjectConfig-ORIGINAL.xml` is the Bundle ObjectConfig as it was before the test: only `roleTypeDefinitions`, no ObjectAttributes. If other Role attributes have been added since, delete just `sbxKommentarsText` instead (Global Settings → Role Attributes, or edit `ObjectConfig-Bundle-CURRENT.xml`), so the newer ones aren't lost.
* Hard-refresh the browser after uninstalling the plugin.

To recreate the test setup from scratch: `./scripts/import-test-objects.sh`, then `./scripts/build.sh && ./scripts/install.sh`.

## Directory contents

```
IIQ-Role-Textarea-Test/
├── README.md                                   this document
├── plugin/SBXRoleTextarea/                     plugin source (zip root)
│   ├── manifest.xml
│   └── ui/js/roleTextarea.js
├── dist/
│   ├── SBXRoleTextarea.zip                     built by scripts/build.sh (same contents)
│   └── SBXRoleTextarea-as-installed-2026-10-01.zip   exact zip installed in the sandbox
├── scripts/
│   ├── env.sh                                  JAVA_HOME / IIQ bin path / console helper
│   ├── build.sh
│   ├── install.sh                              install | upgrade
│   ├── uninstall.sh
│   ├── import-test-objects.sh                  recreate test ObjectConfig/role/rule
│   └── revert-sandbox.sh                       full revert (not run)
├── sandbox-objects/
│   ├── import/                                 files actually imported during the test
│   │   ├── Bundle-ObjectConfig-ORIGINAL.xml    pre-test backup
│   │   ├── Bundle-ObjectConfig-SBX.xml         modified ObjectConfig (with sbxKommentarsText)
│   │   ├── SBX-Textarea-Test-Role.xml          test role as imported
│   │   └── SBX-Restore-Kommentar-Rule.xml      restore rule
│   └── live-export/                            exported from IIQ after testing (2026-10-01)
│       ├── ObjectConfig-Bundle-CURRENT.xml
│       ├── Bundle-SBX-Textarea-Test-Role-CURRENT.xml
│       ├── Rule-SBX-Restore-Kommentar-CURRENT.xml
│       └── SBXRoleTextarea-exported-from-IIQ.zip   (plugin export; manifest re-serialised by IIQ, JS identical)
└── decompiled-reference/                       CFR output, SailPoint proprietary, local only
    ├── AttributeEditBean.java
    ├── ObjectAttributeDTO.java
    ├── ObjectAttribute.java
    └── BaseAttributeDefinition.java
```
# iiq-role-textarea-plugin
