package week_8.grades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DatabaseConnection {
        private static final String URL = "jdbc:sqlite:/Users/aidarozanski/Documents/jdbc_hw2/grades.db";/

        public static Connection connect() {
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(URL);
                System.out.println("Connection to SQLite has been established.");
            } catch (SQLException e) {
                System.out.println("Connection failed: " + e.getMessage());
            }
            return conn;
        }

        public static void closeConnection(Connection conn) {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {
                    System.out.println("Failed to close the connection: " + e.getMessage());
                }
            }
        }
    }

