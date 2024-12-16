package week_10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public synchronized void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        synchronized (books) {
            books.stream().filter(Book::isAvailable).forEach(System.out::println);
        }
    }

    public void checkOutBook(int i) {
    }

    public void returnBook(int i) {
    }

    public void isAvailable(int i) {
    }

    public int size() {
    }
}

