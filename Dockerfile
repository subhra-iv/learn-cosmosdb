# Base image
FROM adoptopenjdk

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file to the working directory
COPY target/learn-cosmosdb.jar learn-cosmosdb.jar

# Expose any necessary ports (replace <port_number> with the actual port number)
EXPOSE 9002

# Set the entry point command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "learn-cosmosdb.jar"]
