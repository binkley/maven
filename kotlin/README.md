<a href="LICENSE.md">
<img src="https://unlicense.org/pd-icon.png" alt="Public Domain" align="right"/>
</a>

# Kotlin

[![Public Domain](https://img.shields.io/badge/license-Unlicense-blue.svg)](http://unlicense.org/)

Kotlin Maven exemplar

* [Build](#build)

## Build

Try:

```
$ ./build.sh
```

There is tension between a "clean build" (quiet, no output except on errors),
and seeing progress.  This Maven configuration leans to "quiet builds".  To
see progress, use:

```shell script
./mvnw -C -Dorg.slf4j.simpleLogger.defaultLogLevel=INFO clean verify
```

_NB_: the `-C` flag enforces
[strict checksums](https://snyk.io/blog/10-maven-security-best-practices/).
