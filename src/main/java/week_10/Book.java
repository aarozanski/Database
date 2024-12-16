package week_10;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // All books start as available
    }

    public synchronized void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out: " + title);
        } else {
            System.out.println("Book not available: " + title);
        }
    }

    public synchronized void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Checked out)");
    }
}

