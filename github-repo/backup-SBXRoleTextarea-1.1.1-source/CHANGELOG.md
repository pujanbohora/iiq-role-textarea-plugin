# Changelog

## 1.1.1

* The REST endpoint no longer evaluates edit mode or allowed values. It only checks that a configured name is a single-valued String Role attribute. Whether an attribute is editable is decided solely by what IdentityIQ renders.
* The snippet skips inputs that are `disabled` or `readOnly`.
* Help text of the setting updated.

## 1.1.0

* The list of multiline attributes became a plugin setting (`multilineAttributes`), served to the Role Editor page by a plugin REST endpoint (`GET /plugin/rest/sbxroletextarea/config`, `@AllowAll`).
* Configured names are validated against the Bundle ObjectConfig.

## 1.0.0

* Prototype: a page snippet with a hard-coded list of attribute names.
