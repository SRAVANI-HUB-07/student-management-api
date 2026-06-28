# Student Management System – Backend API

A RESTful backend application built with **Java 21**, **Spring Boot**, and **MySQL** for managing student records and generating AI-powered personalized study recommendations using the **OpenAI Java SDK**.

The application follows a layered architecture and demonstrates modern backend development practices including REST API design, DTOs, validation, exception handling, database persistence, Docker containerization, and cloud deployment.

---

# Project Overview

This backend powers a Student Management System by providing APIs to:

- Manage student records
- Store student data in MySQL
- Generate personalized AI study recommendations
- Support a React frontend through REST APIs

The project is designed with separation of concerns using Controller, Service, and Repository layers, making it scalable and maintainable.

---

# Features

## Student Management

- Add Student
- Retrieve All Students
- Search Students by Name
- Update Student Information
- Delete Student Records

## AI Recommendation

Generate personalized study plans based on:

- Student Name
- Area of Interest
- Skill Level
- Weekly Study Hours

The backend sends a structured prompt to the OpenAI API and returns an AI-generated recommendation.

---

# Technology Stack

## Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

## Database

- MySQL

## AI

- OpenAI Java SDK
- OpenAI Chat Completions API

## Deployment

- Docker
- Render
- Railway

## Development Tools

- IntelliJ IDEA
- Postman
- Git
- GitHub
- MySQL Workbench

---

# Backend Architecture

```text
React Frontend
       │
       ▼
REST API (Spring Boot)
       │
       ▼
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
```

### AI Recommendation Flow

```text
Client
   │
   ▼
AI Controller
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
    │       ├── mapper
    │       ├── repository
    │       ├── service
    │       └── config
    │
    └── resources
        ├── application.properties
        └── application-example.properties
```

---

# REST API Endpoints

## Student APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/students` | Retrieve all students |
| GET | `/students/name/{name}` | Search students by name |
| POST | `/students` | Add a student |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

---

## AI API

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/ai/recommendation` | Generate an AI-powered study recommendation |

---

# Running the Application

## Clone the Repository

```bash
git clone https://github.com/SRAVANI-HUB-07/student-management-api.git
cd student-management-api
```

---

## Configure Environment Variables

Create a `.env` file:

```text
SPRING_DATASOURCE_URL=jdbc:mysql://localhost:3306/student_db
SPRING_DATASOURCE_USERNAME=YOUR_USERNAME
SPRING_DATASOURCE_PASSWORD=YOUR_PASSWORD
OPENAI_API_KEY=YOUR_OPENAI_API_KEY
```

The repository includes an `application-example.properties` file as a reference.

---

## Build

```bash
./mvnw clean install
```

---

## Run

```bash
./mvnw spring-boot:run
```

The backend starts on:

```
http://localhost:8080
```

---

# Running with Docker

Build the Docker image:

```bash
docker build -t student-api .
```

Run the container:

```bash
docker run --env-file .env -p 8080:8080 student-api
```

---

# Security

Sensitive configuration files are excluded from version control.

The repository does **not** contain:

- Database credentials
- OpenAI API Key
- Local environment configuration

Use:

- `.env`
- `application-example.properties`

to configure the application locally.

---

# Future Enhancements

- JWT Authentication
- Role-Based Authorization
- Swagger / OpenAPI Documentation
- Pagination & Sorting
- Unit & Integration Testing
- File Upload Support
- AWS Deployment
- CI/CD Pipeline

---

# Related Repository

Frontend (React)

https://github.com/SRAVANI-HUB-07/student-management-frontend

---

# Author

**Sravani Mamidi**

Master of Science in Computer Science

Java • Spring Boot • REST APIs • MySQL • AI Integration