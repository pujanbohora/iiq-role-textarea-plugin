#!/bin/bash
# Packages plugin/SBXRoleTextarea into dist/SBXRoleTextarea.zip
# (manifest.xml must be at the zip root).
set -e
source "$(dirname "$0")/env.sh"
mkdir -p "$PROJECT_DIR/dist"
rm -f "$PROJECT_DIR/dist/SBXRoleTextarea.zip"
cd "$PROJECT_DIR/plugin/SBXRoleTextarea"
zip -r "$PROJECT_DIR/dist/SBXRoleTextarea.zip" manifest.xml ui -x '.*'
unzip -l "$PROJECT_DIR/dist/SBXRoleTextarea.zip"
