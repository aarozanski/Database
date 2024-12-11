package week_8.grades_2;

import java.sql.*;

public class SQLiteExample {
    public static void main(String[] args) {
        // Database URL for SQLite
        String url = "jdbc:sqlite:/Users/aidarozanski/Documents/jdbc_hw2/grades_2.db";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Create the table (if not exists)
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name TEXT," +
                    "age INTEGER," +
                    "grade REAL" +
                    ")";
            stmt.executeUpdate(createTableSQL);

            // Insert data
            String insertSQL = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertSQL)) {
                insertStmt.setString(1, "Alice");
                insertStmt.setInt(2, 20);
                insertStmt.setDouble(3, 9.5);
                insertStmt.executeUpdate();

                // Optionally, add more inserts here if needed
            }

            // Retrieve and print data
            String selectSQL = "SELECT * FROM students";
            try (ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    double grade = rs.getDouble("grade");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Grade: " + grade);
                    System.out.println();
                }
            }

            // Update a record
            String updateSQL = "UPDATE students SET grade = 9.2 WHERE id = 1";
            stmt.executeUpdate(updateSQL);

            // Delete a record
            String deleteSQL = "DELETE FROM students WHERE id = 2";
            stmt.executeUpdate(deleteSQL);

        } catch (SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

