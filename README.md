# E-Commerce Backend

This project is an E-Commerce backend system that provides APIs to manage products, users, orders, and payments. The project is built with **Spring Boot** and **MySQL**, and it aims to deliver a scalable solution for e-commerce applications.

## Features
- User Registration and Authentication
- Product Management (Add, Edit, Delete) CRUD operations
- Shopping Cart and Order Management
- Secure API Endpoints with JWT-based Authentication

## Technologies Used
- **Backend**: Spring Boot
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Token)
- **Others**: Maven, Spring Security, Spring Data JPA

## Setup Instructions

### Prerequisites
- Java 11 or above
- Maven
- MySQL

### Steps to Run the Project

Clone the repository:
   ```bash
   git clone https://github.com/Poorvansh26/E-Comm.git
Navigate to the project directory:

bash
cd E-Comm
Create a MySQL database and import the schema (see schema.sql file in the project).

Update the database configuration in src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecomm_db
spring.datasource.username=root
spring.datasource.password=password
Build the project using Maven:

bash
mvn clean install
Run the application:

bash
mvn spring-boot:run

Endpoints
POST /api/auth/register: Register a new user.
POST /api/auth/login: Login and obtain JWT token.
GET /api/products: Get a list of all products.
POST /api/products: Add a new product (Admin only).
PUT /api/products/{id}: Update product details (Admin only).
DELETE /api/products/{id}: Delete a product (Admin only).
GET /api/orders: View orders for a user (JWT required).


Contributing
Fork the repository.
Create your feature branch (git checkout -b feature/YourFeature).
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature/YourFeature).
Open a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

SQL
Make sure to adjust any paths, configurations, or instructions as per the specific details of your project.





