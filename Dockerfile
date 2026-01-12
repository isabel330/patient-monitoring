# Use an official lightweight Java runtime as the base image
FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu




# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot JAR into the container
COPY build/libs/*.jar app.jar

# Expose the port that the application runs on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
