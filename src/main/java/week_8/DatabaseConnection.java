package week_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/mysql_db"; // Correct database name

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
        properties.put("password", "Katmandu7$");
        properties.put("useSSL", "false");
        properties.put("autoReconnect", "true");

        return DriverManager.getConnection(URL, properties);
    }
}


