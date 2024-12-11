package week_8.grades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void insert(String name, int age, double grade) {
        String sql = "INSERT INTO students(name, age, grade) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, grade);
            pstmt.executeUpdate();
            System.out.println("Record has been inserted.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

