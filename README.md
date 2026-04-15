
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
⚙️ How to Run the ApplicationClone the Repository:Bashgit clone [your-repository-link]
Add JDBC Driver: Ensure the mysql-connector-j (MySQL JDBC Driver) is added to your project's library dependencies.Configure Connection: Open DatabaseConnection.java and update the url, user, and password variables to match your local MySQL credentials.Run: Execute the MainMenu.java file from your IDE (e.g., Apache NetBeans).📺 Video DemonstrationA full walkthrough of the application—including adding, viewing, and deleting records—can be found here:[Insert Your Google Drive/YouTube Link Here] 📋 Features & CRUD OperationsStudent Management: Add, view, update, and delete student profiles .Course Management: Add, view, update, and delete available courses .Enrollment: Link students to courses using dropdown menus and view the enrollment history in a dynamic table .
