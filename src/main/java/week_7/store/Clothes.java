package week_7.store;

public class Clothes {
    private String size;
    private String material;

    public Clothes(String size, String material) {
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}


