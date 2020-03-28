#!/bin/sh

test -r target/maven-kotlin-exemplar-0-SNAPSHOT-jar-with-dependencies.jar || ./mvnw -C "$@"

exec java -jar target/maven-kotlin-exemplar-0-SNAPSHOT-jar-with-dependencies.jar
