# Trying to repro issue [#340](https://github.com/open-telemetry/opentelemetry-auto-instr-java/issues/340)

Build:

```
mvn clean package
```

Run:

```
java -javaagent:opentelemetry-auto-0.2.2.jar \
     -Dota.exporter.jar=opentelemetry-auto-exporters-logging-0.2.2.jar \
     -jar target/test.jar
```

Test:

Go to `http://localhost:8080/test`
