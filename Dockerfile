FROM openjdk:17

EXPOSE 8082

COPY target/github-action-testing.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]