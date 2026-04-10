# 🎓 Student Management System (Spring Boot)

## 📌 Short Introduction

This project is a simple **Student Management System** developed using **Spring Boot (Java)**.
It demonstrates the basic architecture of a web application using:

* Controller layer (handling HTTP requests)
* Service layer (business logic)
* Repository layer (data storage)
* Model (Student entity)

The application allows users to **add and view students through a web interface**.

---

## ❗ Problem Statement

Create an industry oriented application using Spring Framework

This project aims to provide:

* A simple web-based system to **store student details (ID, Name)**
* A **user-friendly interface** for adding and viewing students
* A structured backend using **Spring Boot architecture**

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Maven
* Embedded Tomcat Server

---

## ▶️ How to Run the Project

### 📁 Step 1: Navigate to Project Directory

Open terminal and go to:

```
/media/ai/Storage/Java/Practicals/student-management
```

---

### 🔧 Step 2: Build the Project

Run:

```
mvn clean install
```

---

### 🚀 Step 3: Run the Application

```
mvn spring-boot:run
```

---

### 🌐 Step 4: Access in Browser

* Home Page:

```
http://localhost:8080/students/home
```

* View Students:

```
http://localhost:8080/students
```

---

## 📂 Project Structure

```
student-management/
│── src/
│   └── main/
│       ├── java/
│       │   └── com/example/demo/
│       │       └── StudentManagement.java
│       └── resources/
│           └── application.properties
│── pom.xml
```

---

## ⚠️ Limitations

* Data is stored in memory (lost after restart)
* No database integration
* Uses GET request for adding data (not recommended for production)

---

## 🚀 Future Improvements

* Integrate MySQL database
* Use POST APIs instead of GET
* Add validation and error handling
* Implement REST API structure
* Add authentication (login system)

---

## 👨‍💻 Author

RB
