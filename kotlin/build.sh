#!/usr/bin/env bash

./mvnw -C -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO clean verify site
