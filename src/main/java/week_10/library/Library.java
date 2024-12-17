package week_10.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public synchronized void addBook(Book book) {
        books.add(book);
        System.out.println("Library: Added \"" + book.getTitle() + "\"");
    }

    public synchronized void checkOutBook(int index, String userName) {
        if (index >= 0 && index < books.size()) {
            books.get(index).checkOut(userName);
        }
    }

    public synchronized void returnBook(int index, String userName) {
        if (index >= 0 && index < books.size()) {
            books.get(index).returnBook(userName);
        }
    }

    public synchronized boolean isAvailable(int index) {
        return index >= 0 && index < books.size() && books.get(index).isAvailable();
    }

    public synchronized int size() {
        return books.size();
    }

    public synchronized String getBookTitle(int index) {
        return index >= 0 && index < books.size() ? books.get(index).getTitle() : "";
    }

    public void displayAvailableBooks() {
        System.out.println("Final available books in library:");
        synchronized (books) {
            books.stream().filter(Book::isAvailable).forEach(System.out::println);
        }
    }
}



