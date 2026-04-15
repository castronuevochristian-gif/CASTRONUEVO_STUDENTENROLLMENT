Student Enrollment System (CRUD Application)
Overview

This project is a Simple Student Enrollment System developed using Java Swing and MySQL. It allows users to manage students, courses, and enrollments through a graphical user interface (GUI) with full CRUD (Create, Read, Update, Delete) functionality.

The system demonstrates database interaction, GUI development, and relational data management.

Objectives
Design an Entity-Relationship Diagram (ERD) with three tables:
Student
Course
Enrolled Subject
Develop a Java Swing application for managing records
Implement full CRUD operations
Connect the application to a MySQL database
Database Structure
Student Table
Column	Description
student_id	Primary Key
first_name	Student first name
last_name	Student last name
age	Student age
email	Student email
Course Table
Column	Description
course_id	Primary Key
course_name	Course name
course_description	Course description
credits	Number of credits
Enrolled Subject Table
Column	Description
enrollment_id	Primary Key
student_id	Foreign Key (Student)
course_id	Foreign Key (Course)
enrollment_date	Date of enrollment
Relationships
One Student can have many Enrollments (one-to-many)
One Course can have many Enrollments (one-to-many)
Features
Student Management
Add new students
View all students
Update student information
Delete student records
Course Management
Add new courses
View all courses
Update course details
Delete courses
Enrollment Management
Enroll a student in a course
View all enrollments
Delete enrollments
Technologies Used
Java (Swing for GUI)
MySQL (Database)
JDBC (Database Connectivity)
Project Structure
GUI Classes (Student, Course, Enrollment windows)
Database Connection Class
SQL File (database schema)
Main Application Class
How to Run the Application
Clone the repository:
git clone <your-repository-link>
Open the project in your IDE (e.g., NetBeans, IntelliJ, Eclipse)
Set up the MySQL database:
Create a database
Import the provided SQL file
Configure database connection:
Update database URL, username, and password in your Java code
Add MySQL JDBC Driver to the project
Run the main class
Testing

Ensure the following functionalities work properly:

Add, view, update, and delete students
Add, view, update, and delete courses
Enroll, view, and delete enrollments
Proper database interaction and data display
