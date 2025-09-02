# Use JDK runtime image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy your jar (adjust the name if needed)
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]


