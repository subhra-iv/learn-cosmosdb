# Prerequisites
Docker: Ensure that Docker is installed on your local machine.
You can download Docker from the official Docker website and follow the installation instructions for your operating system.

# Getting Started
Follow the steps below to run the Dockerized Spring Boot application locally:

Clone the repository:
``
git clone https://github.com/subhra-iv/learn-cosmosdb.git
``

Navigate to the project directory:
``
cd learn-cosmosdb
``

Build the Docker image:
``
docker build -t learn-cosmosdb .
``

Run the Docker container:
``
docker run -p 9002:9002 learn-cosmosdb
``

The application will start running inside the Docker container and will be accessible at http://localhost:9002.

# API Usage
You can use cURL or tools like Postman to interact with the API endpoints provided by the application.

Postman Collection:
https://api.postman.com/collections/27431174-90468635-39b2-450f-b5eb-52f83b4ffd9c?access_key=PMAT-01H30BJAHA5C517N21WQRK8BBW

cURL Command to test:
``
curl -X POST -H "Content-Type: application/json" -d '{
"name": "John Doe",
"email": "johndoe@example.com",
"address": {
"address": "123 Main St",
"city": "New York",
"state": "NY",
"zip": "10001"
}
}' http://localhost:9002/customers
``
``
curl -X GET http://localhost:9002/customers
``
