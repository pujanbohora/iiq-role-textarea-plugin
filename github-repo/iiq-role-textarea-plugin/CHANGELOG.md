# Changelog

## 1.2.0

* Renamed for publication. No functional change compared with 1.1.1.
  * Plugin name `RoleTextarea` (display name "Role Extended Attribute Textarea").
  * REST endpoint `GET /plugin/rest/roletextarea/config`.
  * Java package `roletextarea.rest`; jar `lib/roletextarea.jar`; zip `RoleTextarea-<version>.zip`.
* IdentityIQ treats this as a new plugin. If an earlier internal build is installed, uninstall or disable it and enter the configuration again.

## 1.1.1 (internal name, not published)

* The REST endpoint no longer evaluates edit mode or allowed values. It only checks that a configured name is a single-valued String Role attribute. Whether an attribute is editable is decided solely by what IdentityIQ renders.
* The snippet skips inputs that are `disabled` or `readOnly`.
* Help text of the setting updated.

## 1.1.0 (internal name, not published)

* The list of multiline attributes became a plugin setting (`multilineAttributes`), served to the Role Editor page by a plugin REST endpoint (`@AllowAll`).
* Configured names are validated against the Bundle ObjectConfig.

## 1.0.0 (internal prototype)

* Prototype: a page snippet with a hard-coded list of attribute names.
