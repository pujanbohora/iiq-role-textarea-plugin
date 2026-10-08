#!/bin/bash
# Builds SBXRoleTextarea 1.1.0:
#   src/**/*.java  -> build/classes -> build/zip/lib/sbx-roletextarea.jar
#   plugin/*       -> build/zip/
#   build/zip      -> dist/SBXRoleTextarea-1.1.0.zip
# Compiles against the sandbox's IIQ 8.0 jars (Java 8 target).
set -e
cd "$(dirname "$0")"
export JAVA_HOME=${JAVA_HOME:-/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home}
export PATH="$JAVA_HOME/bin:$PATH"
IIQ_LIB=${IIQ_LIB:-/Users/pujanbohora/Documents/Developer/apache-tomcat-9.0.104/webapps/identityiq/WEB-INF/lib}
VERSION=$(sed -n 's/.*<Plugin .*version="\([^"]*\)".*/\1/p' plugin/manifest.xml)

rm -rf build && mkdir -p build/classes build/zip/lib dist
CP="$IIQ_LIB/identityiq.jar:$IIQ_LIB/jaxrs-ri-2.22.2.jar:$IIQ_LIB/commons-logging-1.2.jar"
javac -source 1.8 -target 1.8 -encoding UTF-8 -cp "$CP" -d build/classes $(find src -name '*.java')
jar cf build/zip/lib/sbx-roletextarea.jar -C build/classes .

cp -R plugin/. build/zip/
rm -f "dist/SBXRoleTextarea-$VERSION.zip"
(cd build/zip && zip -qr "../../dist/SBXRoleTextarea-$VERSION.zip" . -x '.*')
unzip -l "dist/SBXRoleTextarea-$VERSION.zip"
