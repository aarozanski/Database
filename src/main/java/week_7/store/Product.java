package week_7.store;

public class Product<T> {
    private String name;
    private double price;
    private T details;

    public Product(String name, double price, T details) {
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", details=" + details +
                '}';
    }
}


