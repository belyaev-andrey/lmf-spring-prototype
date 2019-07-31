native-image --no-server \
  --allow-incomplete-classpath \
  --no-fallback \
  --report-unsupported-elements-at-runtime \
  -jar target/lmf-spring-prototype-1.0-SNAPSHOT.jar
