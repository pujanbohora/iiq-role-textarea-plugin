#!/bin/bash
# Removes the plugin. RoleEditor falls back to the stock single-line input
# (hard-refresh the browser).
set -e
source "$(dirname "$0")/env.sh"
printf "plugin uninstall SBXRoleTextarea\nplugin list\nquit\n" | iiq_console
