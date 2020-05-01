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

Use `./mvnw` (Maven) or `./batect build` (Batect) to build, run tests, and
create a demo program.  Use `./run.sh` or `./batect run` to run the demo.

[Batect](https://batect.dev/) works "out of the box", however, an important
optimization is to avoid redownloading plugins and dependencies from within
the Docker container.

With Batect, link to your user Maven cache directory:

```
$ ln -s ~/.m2 .maven-cache
```

This will share local Maven plugin and dependency downloads with the Docker
container run by Batect.

_NB_: the `-C` flag enforces
[strict checksums](https://snyk.io/blog/10-maven-security-best-practices/).

### Noisy vs quiet

There is tension between a "clean build" (quiet, no output except on errors),
and seeing progress.  This Maven configuration uses "noisy builds".  To be
quiet, use:


```shell script
./mvnw -C -Dorg.slf4j.simpleLogger.defaultLogLevel=WARN clean verify
```
