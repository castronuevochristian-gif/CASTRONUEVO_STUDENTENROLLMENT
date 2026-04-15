

# Student Enrollment System (CRUD)

A simple Student Enrollment System developed using **Java Swing** and **MySQL**. [cite_start]This application allows for full CRUD (Create, Read, Update, Delete) operations across three key entities: Students, Courses, and Enrolled Subjects[cite: 3, 4].

##  Project Structure
[cite_start]The project is organized into several Java classes, each handling a specific part of the GUI and database interaction[cite: 27, 28, 147]:
* [cite_start]**`DatabaseConnection.java`**: Handles the connection between the Java application and the MySQL database[cite: 141].
* [cite_start]**`StudentWindow.java`**: Management interface for student records (First Name, Last Name, Age, Email)[cite: 30, 39].
* [cite_start]**`CourseWindow.java`**: Management interface for course details (Name, Description, Credits)[cite: 65, 74].
* [cite_start]**`EnrollmentWindow.java`**: Interface for enrolling students into specific courses[cite: 100, 107].
* **`MainMenu.java`**: The primary navigation hub for accessing different management windows.

##  Database Setup
The system requires a MySQL database named `student_enrollment_db`. [cite_start]Follow these steps to set up the required tables[cite: 6, 153]:

1. Open your MySQL Workbench or Command Line.
2. [cite_start]Run the following SQL commands to create the necessary schema[cite: 7, 13, 18, 148]:

```sql
CREATE DATABASE student_enrollment_db;
USE student_enrollment_db;

-- 1. Student Table
CREATE TABLE student (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

-- 2. Course Table
CREATE TABLE course (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100),
    course_description TEXT,
    credits INT
);

-- 3. Enrolled Subject Table
CREATE TABLE enrolled_subject (
    enrollment_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    course_id INT,
    enrollment_date DATE,
    FOREIGN KEY (student_id) REFERENCES student(student_id),
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);
```

##  How to Run the Application
1. [cite_start]**Clone the Repository**[cite: 145]:
   ```bash
   git clone [your-repository-link]
   ```
2. [cite_start]**Add JDBC Driver**: Ensure the `mysql-connector-j` (MySQL JDBC Driver) is added to your project's library dependencies[cite: 154].
3. [cite_start]**Configure Connection**: Open `DatabaseConnection.java` and update the database URL, user, and password to match your local MySQL credentials[cite: 141].
4. [cite_start]**Run**: Execute the `MainMenu.java` file from your IDE (e.g., Apache NetBeans)[cite: 152].

##  Video Demonstration
[cite_start]A full walkthrough of the application—including adding, viewing, and deleting records—can be found here[cite: 138, 139, 140]:
* [cite_start]**[Insert Your Google Drive/YouTube Link Here]** [cite: 156]

##  Features & CRUD Operations
* [cite_start]**Student Management**: Add, view, update, and delete student profiles[cite: 31, 32, 33, 34, 35].
* [cite_start]**Course Management**: Add, view, update, and delete available courses[cite: 66, 67, 68, 69, 70].
* [cite_start]**Enrollment**: Link students to courses using dropdown menus and view enrollment history in a dynamic table[cite: 101, 102, 103, 104, 111].
