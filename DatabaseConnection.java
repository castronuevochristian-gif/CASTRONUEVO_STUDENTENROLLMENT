package com.enrollment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Make sure your database is named exactly this in MySQL Workbench
    private static final String URL = "jdbc:mysql://localhost:3306/student_enrollment_db";
    private static final String USER = "root"; 
    
    // 
    private static final String PASSWORD = "Isekaitruck04_"; 

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database. Check your password and ensure MySQL is running.");
            e.printStackTrace();
        }
        return connection;
    }
    
    // A tiny test method just to see if it works right now
    public static void main(String[] args) {
        getConnection();
    }
}