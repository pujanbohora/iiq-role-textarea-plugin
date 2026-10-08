#!/bin/bash
# Builds the RoleTextarea plugin zip.
#
#   IIQ_HOME=/path/to/identityiq ./build.sh
#
# IIQ_HOME is the exploded IdentityIQ web application (the directory that
# contains WEB-INF). Its WEB-INF/lib jars are used as the compile classpath
# only; nothing from IdentityIQ is copied into the plugin.
# Alternatively set IIQ_LIB to a directory holding the IdentityIQ jars.
set -e
cd "$(dirname "$0")"

IIQ_LIB=${IIQ_LIB:-${IIQ_HOME:+$IIQ_HOME/WEB-INF/lib}}
if [ -z "$IIQ_LIB" ] || [ ! -f "$IIQ_LIB/identityiq.jar" ]; then
    echo "Set IIQ_HOME (exploded identityiq webapp) or IIQ_LIB (directory containing identityiq.jar)" >&2
    exit 1
fi

VERSION=$(sed -n 's/.*<Plugin .*version="\([^"]*\)".*/\1/p' plugin/manifest.xml)
ZIP="dist/RoleTextarea-$VERSION.zip"

rm -rf build && mkdir -p build/classes build/zip/lib dist

# IdentityIQ 8.0 runs on Java 8, so target Java 8 bytecode
javac -source 1.8 -target 1.8 -encoding UTF-8 -cp "$IIQ_LIB/*" -d build/classes $(find src -name '*.java')
jar cf build/zip/lib/roletextarea.jar -C build/classes .

cp -R plugin/. build/zip/
rm -f "$ZIP"
(cd build/zip && zip -qr "../../$ZIP" manifest.xml ui lib)

echo "Built $ZIP"
unzip -l "$ZIP"
