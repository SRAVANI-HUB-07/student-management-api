# Student Management API

A backend REST API built with **Java** and **Spring Boot** to learn modern backend software engineering concepts, including RESTful API development, layered architecture, MySQL database integration, and AI-powered features using the **OpenAI Java SDK**.

This project serves as the backend for a Student Management System and provides CRUD operations for managing students, along with an AI feature that generates personalized study plans based on a student's interests and learning goals.

---

# Project Purpose

The primary goal of this project is to strengthen backend development fundamentals by implementing a real-world Spring Boot application from scratch.

This project focuses on understanding:

* REST API Development
* Spring Boot Architecture
* Controller → Service → Repository Architecture
* DTO (Data Transfer Object) Pattern
* Request Validation
* Exception Handling
* Database Integration with MySQL
* HTTP Request & Response Lifecycle
* JSON Serialization & Deserialization
* AI Integration using the OpenAI Java SDK

Rather than simply making the application work, this project was built to understand how each layer of a backend application communicates internally.

---

# Technologies Used

## Backend

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven

## Database

* MySQL

## AI Integration

* OpenAI Java SDK
* OpenAI Chat Completions API

## Development Tools

* IntelliJ IDEA
* Postman
* Git
* GitHub

---

# Features

## Student Management

* Add Student
* View All Students
* Search Students by Name
* Update Student
* Delete Student

## Backend Features

* RESTful API Design
* Layered Architecture
* DTO-based Request & Response Models
* Input Validation
* Exception Handling
* MySQL Persistence using Spring Data JPA

## AI Study Plan Generator

Generate a personalized four-week study plan based on:

* Student Name
* Area of Interest
* Skill Level
* Weekly Study Hours

The backend sends a prompt to the OpenAI API and returns an AI-generated study plan to the frontend.

---

# Project Architecture

```text
Client (React)

        │
        ▼

REST API (Spring Boot)

        │

Controller
        │
        ▼
Service
        │
        ▼
Repository
        │
        ▼
MySQL Database


AI Recommendation

Controller
        │
        ▼
AI Service
        │
        ▼
OpenAI Java SDK
        │
        ▼
OpenAI API
```

---

# Project Structure

```text
src
└── main
    ├── java
    │   └── com.sravani.studentapi
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── exception
    │       ├── repository
    │       └── service
    │
    └── resources
        ├── application.properties
        └── application-example.properties
```

---

# REST API Endpoints

## Student APIs

| Method | Endpoint                | Description                |
| ------ | ----------------------- | -------------------------- |
| GET    | `/students`             | Retrieve all students      |
| GET    | `/students/name/{name}` | Search students by name    |
| POST   | `/students`             | Create a new student       |
| PUT    | `/students/{id}`        | Update an existing student |
| DELETE | `/students/{id}`        | Delete a student           |

---

## AI API

| Method | Endpoint             | Description                                    |
| ------ | -------------------- | ---------------------------------------------- |
| POST   | `/ai/recommendation` | Generate an AI-powered personalized study plan |

---

# Running the Application

## 1. Clone the repository

```bash
git clone https://github.com/SRAVANI-HUB-07/student-management-api.git
```

---

## 2. Configure MySQL

Create a MySQL database.

Update `application.properties` using the provided `application-example.properties`.

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

---

## 3. Configure the OpenAI API Key

Set the following environment variable:

```text
OPENAI_API_KEY=YOUR_API_KEY
```

---

## 4. Run the Spring Boot Application

Run the application from IntelliJ IDEA or using Maven.

The backend will start on:

```text
http://localhost:8080
```

---

# Security

Sensitive configuration files containing credentials are intentionally excluded from version control.

The repository includes an `application-example.properties` file that can be copied and updated with local configuration values.

---

# Future Improvements

* JWT Authentication
* Role-Based Authorization
* Swagger / OpenAPI Documentation
* Pagination & Sorting
* Docker Support
* AWS Deployment
* Unit & Integration Testing
* File Upload Support

---

# Learning Outcomes

This project strengthened my understanding of:

* Java Backend Development
* Spring Boot
* Layered Architecture
* REST API Design
* DTO Pattern
* Spring Data JPA & Hibernate
* MySQL Integration
* HTTP Communication
* JSON Processing
* AI Integration using the OpenAI Java SDK
* Git & GitHub Workflow
