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

    public synchronized int size() {
        return books.size();
    }

    public synchronized void checkOutBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).checkOut();
        }
    }

    public synchronized void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.get(index).returnBook();
        }
    }

    public synchronized boolean isAvailable(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index).isAvailable();
        }
        return false;
    }
}


