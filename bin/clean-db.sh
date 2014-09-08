#!/bin/sh

# Determine the current directory, thanks bash!

SOURCE="${BASH_SOURCE[0]}"
while [ -h "$SOURCE" ]; do # resolve $SOURCE until the file is no longer a symlink
  DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"
  SOURCE="$(readlink "$SOURCE")"
  [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE" # if $SOURCE was a relative symlink, we need to resolve it relative to the path where the symlink file was located
done
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"

CURRENT_DIR="$( pwd )"

cd ${DIR}/..
mvn package
java -jar ${DIR}/../target/appendage-0.0.1.jar db drop-all --confirm-delete-everything --catalog identity --schema public dev.yml
java -jar ${DIR}/../target/appendage-0.0.1.jar db migrate dev.yml
mvn package
cd ${CURRENT_DIR}
