#!/bin/bash
# FULL REVERT of the experiment (v1.0 and v1.1). NOT run as part of the investigation.
# 1. uninstall plugins (RoleTextarea 1.2.0 and the old SBXRoleTextarea 1.1.1)
#              2. restore original Bundle ObjectConfig
# 3. delete test role            4. delete test rules
# 5. delete non-admin test user sbxRoleManager
set -e
source "$(dirname "$0")/env.sh"
read -p "Revert all SBX textarea test objects in IIQ? [y/N] " ok
[ "$ok" = "y" ] || exit 1
printf "plugin uninstall RoleTextarea\nplugin uninstall SBXRoleTextarea\nimport %s\ndelete Bundle \"SBX Textarea Test Role\"\ndelete Rule \"SBX Restore Kommentar\"\ndelete Rule \"SBX Seed v1.1 Values\"\ndelete Rule \"SBX Set RoleManager Password\"\ndelete Identity sbxRoleManager\nplugin list\nquit\n" \
    "$PROJECT_DIR/sandbox-objects/import/Bundle-ObjectConfig-ORIGINAL.xml" | iiq_console
