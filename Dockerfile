# Use JDK runtime image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy your jar (adjust the name if needed)
COPY target/BootTask01-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]


