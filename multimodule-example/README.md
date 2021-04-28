# Multi-module Maven example

## Build

```
./mvnw clean verify
```

## Modules

- [Parent POM](./pom.xml) (top-level build)
- [Util](./util/pom.xml) ("library")
- [App](./app/pom.xml) (`main()` depending on `util`)
