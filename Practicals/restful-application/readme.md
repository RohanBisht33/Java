# 📌 RESTful API - Student Management System

## 📖 Introduction

This project is a simple RESTful API developed using Spring Boot. It allows users to perform CRUD operations (Create, Read, Update, Delete) on student data.

The application follows a layered architecture:

* Controller Layer (handles HTTP requests)
* Service Layer (business logic)
* Repository Layer (data handling)
* Model (Student entity)

---

## ❗ Problem Statement

Managing student data manually is inefficient and prone to errors. This project provides a REST-based solution to:

* Store student information
* Retrieve data easily
* Update and delete records dynamically

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Maven
* Embedded Tomcat Server

---

## 📂 Project Structure

```
student-management/
│── src/
│   └── main/
│       ├── java/com/example/demo/
│       │   └── RestfulApiApplication.java
│       └── resources/
│── pom.xml
```

---

## ▶️ How to Run

### Step 1: Navigate to project

```
cd /Java/Practicals/student-management
```

### Step 2: Build

```
mvn clean install
```

### Step 3: Run

```
mvn spring-boot:run
```

---

## 🌐 API Endpoints

### 🔹 GET all students

```
GET http://localhost:8080/api/students
```

### 🔹 POST add student

```
POST http://localhost:8080/api/students
```

Body:

```
{
  "id": 1,
  "name": "RB"
}
```

### 🔹 PUT update student

```
PUT http://localhost:8080/api/students/{id}
```

### 🔹 DELETE student

```
DELETE http://localhost:8080/api/students/{id}
```

---

## ⚠️ Limitations

* Data stored in memory (not permanent)
* No database integration
* No validation or security

---

## 🚀 Future Improvements

* Add MySQL database
* Implement validation
* Add authentication system
* Use proper exception handling

---

## 👨‍💻 Author

RB
