package week_8.grades;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public static void createTable() {
    String sql = "CREATE TABLE IF NOT EXISTS students (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name TEXT NOT NULL," +
            "age INTEGER," +
            "grade DOUBLE)";

    try (Connection conn = DatabaseConnection.connect();
         Statement stmt = conn.createStatement()) {
        stmt.execute(sql);
        System.out.println("Table created successfully or already exists.");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


