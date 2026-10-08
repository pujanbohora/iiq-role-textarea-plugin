#!/bin/bash
# Recreates the 1.1.0 test setup: Bundle ObjectConfig with the 8 sbx* test
# attributes, the non-admin test user sbxRoleManager (BusinessRoleAdministrator)
# and the seeded values on "SBX Textarea Test Role" (role itself comes from
# ../scripts/import-test-objects.sh).
set -e
cd "$(dirname "$0")"
source ../scripts/env.sh
O="$PWD/sandbox-objects"
printf "import %s\nimport %s\nrule \"SBX Set RoleManager Password\"\nimport %s\nrule \"SBX Seed v1.1 Values\"\nquit\n" \
    "$O/Bundle-ObjectConfig-v1.1-test.xml" "$O/SBX-Set-RoleManager-Password-Rule.xml" "$O/SBX-Seed-v1.1-Values-Rule.xml" | iiq_console
