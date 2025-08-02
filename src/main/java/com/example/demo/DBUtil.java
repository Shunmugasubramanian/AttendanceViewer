package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdetails", "root", "");
    }

    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            System.out.println("✅ Database Connected!");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
