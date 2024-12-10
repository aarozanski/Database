package week_7.store;

public class Electronics {
    private String brand;
    private int warranty;

    public Electronics(String brand, int warranty) {
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}

