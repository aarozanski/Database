package week_7.store;
import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public void removeProduct(Product<T> product) {
        products.remove(product);
    }

    public void displayAllProducts() {
        for (Product<T> product : products) {
            System.out.println(product);
        }
    }
}


