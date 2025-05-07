# Base image with Java 17
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy .jar file from target to container
COPY target/ECOMMERCE-WEB-APP-0.0.1-SNAPSHOT.jar app.jar

# Optional: Copy .env file (not used directly in Java, just for reference)
COPY .env .env

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
