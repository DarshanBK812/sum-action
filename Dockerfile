# 1. Use a slim, production-ready JRE base
FROM eclipse-temurin:17-jre-focal-slim

# 2. Label for metadata
LABEL maintainer="darshanbk812@example.com"

# 3. Create & switch to app directory
WORKDIR /app

# 4. Copy the built JAR into the container
COPY target/github-action-testing.jar app.jar

# 5. Expose the application port
EXPOSE 8082

# 6. Health check (requires Spring Boot Actuator on /actuator/health)
HEALTHCHECK --interval=30s --timeout=5s --start-period=30s \
  CMD curl --fail http://localhost:8082/actuator/health || exit 1

# 7. Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
