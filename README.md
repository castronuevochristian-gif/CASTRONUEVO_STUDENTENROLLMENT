

````markdown
# Student Enrollment System

<p align="center">
  <b>A Java Swing CRUD Application with MySQL Integration</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue" />
  <img src="https://img.shields.io/badge/MySQL-Database-orange" />
  <img src="https://img.shields.io/badge/GUI-Java%20Swing-green" />
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen" />
</p>

---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [System Architecture](#system-architecture)
- [Database Schema](#database-schema)
- [Application Modules](#application-modules)
- [Technologies Used](#technologies-used)
- [Installation Guide](#installation-guide)
- [Usage](#usage)
- [Testing](#testing)
- [Project Structure](#project-structure)
- [Future Improvements](#future-improvements)
- [Author](#author)

---

## Overview
The Student Enrollment System is a desktop application built using Java Swing and MySQL. It provides a user-friendly graphical interface to manage students, courses, and enrollments with full CRUD functionality.

This project demonstrates:
- GUI development using Java Swing  
- Database integration using JDBC  
- Relational database design using ERD concepts  

---

## Features

### Student Management
- Create new student records  
- View all students  
- Update student information  
- Delete student records  

### Course Management
- Add new courses  
- View all courses  
- Update course details  
- Delete courses  

### Enrollment Management
- Enroll students in courses  
- View all enrollments  
- Delete enrollment records  

---

## System Architecture

The system follows a simple 3-layer structure:

- Presentation Layer: Java Swing GUI  
- Application Layer: Business logic  
- Data Layer: MySQL database via JDBC  

---

## Database Schema

### Tables
- Student  
- Course  
- Enrolled Subject  

### Relationships
- One-to-Many: Student → Enrolled Subject  
- One-to-Many: Course → Enrolled Subject  

---

## Application Modules

### 1. Student Management Window
Handles all student-related CRUD operations.

### 2. Course Management Window
Handles course creation, updates, and deletion.

### 3. Enrollment Management Window
Handles student-course enrollment and record tracking.

---

## Technologies Used

| Technology | Purpose |
|-----------|--------|
| Java | Core programming language |
| Java Swing | GUI development |
| MySQL | Database |
| JDBC | Database connectivity |

---

## Installation Guide

### Prerequisites
- Java JDK 8 or higher  
- MySQL Server  
- IDE (NetBeans, IntelliJ, Eclipse)  

### Steps

1. Clone the repository:
```bash
git clone https://github.com/your-username/student-enrollment-system.git
````

2. Open the project in your IDE

3. Set up the database:

* Create a MySQL database
* Import the provided SQL file

4. Configure database connection:

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String user = "root";
String password = "your_password";
```

5. Add MySQL JDBC Driver to your project

6. Run the main class

---

## Usage

* Launch the application
* Navigate between Student, Course, and Enrollment windows
* Perform CRUD operations using the GUI
* Data updates automatically in the database

---

## Testing

Verify the following:

* Student CRUD operations work correctly
* Course CRUD operations work correctly
* Enrollment operations function properly
* Database connection is stable
* GUI responds correctly to user input

---

## Project Structure

```
student-enrollment-system/
│
├── src/
│   ├── gui/
│   ├── model/
│   ├── database/
│   └── main/
│
├── sql/
│   └── schema.sql
│
├── README.md
└── .gitignore
```


