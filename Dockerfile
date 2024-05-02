# Use an OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY helloworld.jar /app/helloworld.jar

# Expose the port that the application listens on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "helloworld.jar"]
