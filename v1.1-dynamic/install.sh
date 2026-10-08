#!/bin/bash
# Installs or upgrades SBXRoleTextarea from dist/ via the IIQ console.
#   ./install.sh            -> plugin upgrade (plugin already installed, e.g. 1.0.0)
#   ./install.sh install    -> first-time install
# PluginSync pushes it to the running Tomcat within ~60s. If the Java REST class
# changed, disable and re-enable the plugin in Gear > Plugins afterwards (IIQ 8.0
# does not reload REST classes on a synced upgrade). Then set the
# attribute list under Gear > Plugins > SBX Role Extended Attribute Textarea > Configure.
set -e
cd "$(dirname "$0")"
source ../scripts/env.sh
CMD=${1:-upgrade}
VERSION=$(sed -n 's/.*<Plugin .*version="\([^"]*\)".*/\1/p' plugin/manifest.xml)
printf "plugin %s %s\nplugin list\nquit\n" "$CMD" "$PWD/dist/SBXRoleTextarea-$VERSION.zip" | iiq_console
