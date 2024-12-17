package week_10.library;

public class LibrarySimulation {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        library.addBook(new Book(1, "Java Fundamentals", "John Doe"));
        library.addBook(new Book(2, "Data Structures", "Jane Roe"));

        Thread[] users = new Thread[5];
        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(new User(library, i+1));
            users[i].setPriority(Thread.MIN_PRIORITY + i % (Thread.MAX_PRIORITY - Thread.MIN_PRIORITY));
            users[i].start();
        }

        for (Thread user : users) {
            user.join();
        }

        library.displayAvailableBooks();
    }
}


