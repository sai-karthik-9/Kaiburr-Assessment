# Java REST API for Server Management

This is a Java API for managing server objects. It features CRUD operations and uses MongoDB for data persistence.

## Table of Contents

- [API Overview](#api-overview)
- [Getting Started](#getting-started)
- [How to Use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)

## API Overview
The API endpoints include:

1. **GET /servers**: Fetch all servers or a specific server by id
2. **PUT /servers**: Create a new server 
3. **DELETE /servers/{id}**: Delete a specific server
4. **GET /servers?name={name}**: Find servers by name

Here's an example of a server object:
```json
    {
    “name”: ”my centos”,
    “id”: “123”,
    “language”:”java”,
    “framework”:”django”
    }
Getting Started
In order to set up your development environment, follow these steps:

Install Java 11 Open JDK
Install Spring Boot
Setup MongoDB
Clone this repository
Run the application with ./mvnw spring-boot:run
How to Use
Once your environment is set, you can start making requests to the API using an HTTP client like Postman or curl.

Contributing
We welcome contributions to this project, whether they be bug fixes, new features or additional documentation. To contribute, please fork the project, make your changes, and open a pull request.

License
This project is open-source and available under the MIT License.