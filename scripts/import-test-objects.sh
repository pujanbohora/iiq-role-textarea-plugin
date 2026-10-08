#!/bin/bash
# Recreates the test setup: Bundle ObjectConfig with sbxKommentarsText,
# the test role, and the restore rule (and runs it to reset the value
# to three \n-separated lines).
set -e
source "$(dirname "$0")/env.sh"
I="$PROJECT_DIR/sandbox-objects/import"
printf "import %s\nimport %s\nimport %s\nrule \"SBX Restore Kommentar\"\nquit\n" \
    "$I/Bundle-ObjectConfig-SBX.xml" "$I/SBX-Textarea-Test-Role.xml" "$I/SBX-Restore-Kommentar-Rule.xml" | iiq_console
