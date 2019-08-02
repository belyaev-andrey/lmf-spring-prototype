mvn clean package

native-image --verbose \
  --no-server \
  --allow-incomplete-classpath \
  --no-fallback \
  --report-unsupported-elements-at-runtime \
  --initialize-at-build-time=org.springframework.util.Assert \
  --initialize-at-build-time=org.springframework.core.annotation.AnnotationFilter \
  --initialize-at-build-time=org.springframework.core.annotation.PackagesAnnotationFilter \
  --initialize-at-build-time=org.springframework.util.StringUtils \
  -jar target/lmf-spring-prototype-1.0-SNAPSHOT.jar
