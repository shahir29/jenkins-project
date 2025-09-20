# Step 1: Use official OpenJDK runtime
FROM openjdk:11-jre-slim

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy the jar file from Maven build into container
COPY target/*.jar app.jar

# Step 4: Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]