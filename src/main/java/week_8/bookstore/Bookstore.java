package week_8.bookstore;
import java.sql.*;

class Bookstore {
    private static final String URL = "jdbc:sqlite:/Users/aidarozanski/Documents/jdbc_hw/books.db";
    public static void main(String[] args) {
        Bookstore app = new Bookstore();
// Add a new book
        app.addBook("Effective Java 1", "Joshua Bloch", 38.99);
// Retrieve all books
        app.getAllBooks();
    }
    // Method to establish a connection
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(URL);
    }
    // Method to add a book
    public void addBook(String title, String author, double price) {
        // SQL query to check if the book already exists
        String checkSql = "SELECT COUNT(*) FROM books WHERE title = ? AND author = ?";
        String insertSql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";

        try (Connection conn = connect();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql);
             PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {

            // Set parameters for the check statement
            checkStmt.setString(1, title);
            checkStmt.setString(2, author);
            ResultSet rs = checkStmt.executeQuery();

            // Check if the book exists
            if (rs.next() && rs.getInt(1) == 0) {
                // Book does not exist, proceed with insertion
                insertStmt.setString(1, title);
                insertStmt.setString(2, author);
                insertStmt.setDouble(3, price);
                int rowsInserted = insertStmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new book was inserted successfully!");
                }
            } else {
                // Book already exists
                System.out.println("Error: A book with the same title and author already exists.");
            }
        } catch (SQLException e) {
            if (e.getMessage().contains("UNIQUE constraint failed")) {
                System.out.println("Error inserting book: A book with the same title and author already exists.");
            } else {
                System.out.println("Error inserting book: " + e.getMessage());
            }
        }
    }

    // Method to retrieve all books
    public void getAllBooks() {
        String sql = "SELECT * FROM books";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("Books available in the bookstore:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", Author: " + rs.getString("author") +
                        ", Price: $" + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving books: " +
                    e.getMessage());
        }
    }
}
