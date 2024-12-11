package week_8.grades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void update(int id, double grade) {
        String sql = "UPDATE students SET grade = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, grade);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Record has been updated.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
