# Shared settings for the helper scripts. Adjust paths if the sandbox moves.
export JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home
export PATH="$JAVA_HOME/bin:$PATH"
IIQ_BIN=/Users/pujanbohora/Documents/Developer/apache-tomcat-9.0.104/webapps/identityiq/WEB-INF/bin
PROJECT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

# Run IIQ console commands passed on stdin
iiq_console() {
    (cd "$IIQ_BIN" && ./iiq console)
}
