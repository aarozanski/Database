package week_10.library;

public class Book {
    private final int id;
    private final String title;
    private final String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public synchronized void checkOut(String userName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(userName + ": Checking out \"" + title + "\"");
        } else {
            System.out.println(userName + ": \"" + title + "\" is already checked out.");
        }
    }

    public synchronized void returnBook(String userName) {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(userName + ": Returned \"" + title + "\"");
        } else {
            System.out.println(userName + ": \"" + title + "\" was not checked out.");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isAvailable ? " (Available)" : " (Checked out)");
    }
}


