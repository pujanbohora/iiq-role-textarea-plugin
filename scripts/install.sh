#!/bin/bash
# Installs the plugin via the IIQ console. Use "upgrade" (with a higher
# manifest version) if it is already installed. PluginSync pushes it to the
# running Tomcat within ~60s; hard-refresh the browser afterwards.
set -e
source "$(dirname "$0")/env.sh"
CMD=${1:-install}   # install | upgrade
printf "plugin %s %s\nplugin list\nquit\n" "$CMD" "$PROJECT_DIR/dist/SBXRoleTextarea.zip" | iiq_console
