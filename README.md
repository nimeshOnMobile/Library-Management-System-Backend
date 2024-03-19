# Library Management System

This is a Java Spring Boot project for a Library Management System. It provides functionalities for managing books, members, and loans in a library. The project uses a MySQL database for data storage and includes controllers, services, repositories, and model classes for managing the system.

## Installation

1. Ensure you have Java 21 installed on your system.
2. Clone the repository to your local machine.
3. Configure the MySQL database connection in the `application.properties` file.
4. Run the project using Maven or your preferred IDE with Spring Boot support.

## Project Structure

- **src/main/java/com/example/library_management_system/controller**: Contains the controller classes for handling HTTP requests related to books, members, and loans.
- **src/main/java/com/example/library_management_system/model**: Contains the entity classes representing books, members, loans, and enums.
- **src/main/java/com/example/library_management_system/repository**: Contains the repository interfaces for database operations.
- **src/main/java/com/example/library_management_system/service**: Contains the service classes for business logic implementation.

## Sample SQL Files

The project includes SQL files for creating tables, inserting sample data, and configuring the database schema.

- **creating_tables.sql**: Contains SQL queries for creating tables for books, members, and loans.
- **inserting_tables.sql**: Contains SQL queries for inserting sample data into the tables.

## Usage

- Use the BookController, MemberController, and LoanController classes to handle HTTP requests related to books, members, and loans.
- The BookService, MemberService, and LoanService classes provide methods for interacting with the repository classes and implementing business logic.

## Dependencies

The project uses Maven for dependency management. Some of the key dependencies include:

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- MySQL Connector
- Spring Boot Starter Test
