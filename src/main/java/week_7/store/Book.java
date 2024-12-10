package week_7.store;

public class Book {
    private String author;
    private int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}


