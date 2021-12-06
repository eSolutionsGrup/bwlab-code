FROM openjdk:11
COPY target/borgwarner-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
