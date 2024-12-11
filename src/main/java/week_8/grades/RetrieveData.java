package week_8.grades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {
    public static void selectAll(){
        String sql = "SELECT id, name, age, grade FROM students";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getInt("age") + "\t" +
                        rs.getDouble("grade"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


