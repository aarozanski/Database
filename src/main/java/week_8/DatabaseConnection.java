package week_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite://localhost:3306/hellos.db";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "Katmandu7$"); // Make sure this password meets your MySQL configuration's requirements
        properties.put("useSSL", "false");
        properties.put("autoReconnect", "true");

        return DriverManager.getConnection(URL, properties);
    }
}
