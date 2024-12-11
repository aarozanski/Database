package week_8.grades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT NOT NULL, " +
                "age INTEGER, " +
                "grade DOUBLE);";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'students' has been created.");
        } catch (SQLException e) {
            System.out.println("Create table failed: " + e.getMessage());
        }
    }

    public void insertStudent(String name, int age, double grade) {
        String sql = "INSERT INTO students(name, age, grade) VALUES(?,?,?)";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, grade);
            pstmt.executeUpdate();
            System.out.println("Record has been inserted.");
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Record has been deleted.");
            } else {
                System.out.println("No record found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Delete failed: " + e.getMessage());
        }
    }

    public void updateStudentGrade(int id, double grade) {
        String sql = "UPDATE students SET grade = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, grade);
            pstmt.setInt(2, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Grade has been updated.");
            } else {
                System.out.println("No record found with ID: " + id);
            }
        } catch (SQLException e) {
            System.out.println("Update failed: " + e.getMessage());
        }
    }

    public void listAllStudents() {
        String sql = "SELECT id, name, age, grade FROM students";
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("age") + "\t" +
                        rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
        }
    }
}

