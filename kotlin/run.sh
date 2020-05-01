#!/bin/sh

jar=target/maven-kotlin-exemplar-0-SNAPSHOT-jar-with-dependencies.jar

if ! test -r $jar
then
    echo "$0: Please run './mvnw pacakge' first" >&2
    exit 1
fi

exec java -jar $jar
