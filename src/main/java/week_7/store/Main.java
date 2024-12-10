package week_7.store;

public class Main {
    public static void main(String[] args) {
        // Create instances of each product type
        Book book = new Book("George Orwell", 328);
        Electronics electronic = new Electronics("Samsung", 2);
        Clothes clothes = new Clothes("Medium", "Wool");

        // Create an inventory for each type
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Electronics> electronicInventory = new Inventory<>();
        Inventory<Clothes> clothesInventory = new Inventory<>();

        // Add products to inventories
        bookInventory.addProduct(new Product<>("1984", 15.99, book));
        electronicInventory.addProduct(new Product<>("Television", 799.99, electronic));
        clothesInventory.addProduct(new Product<>("Sweater", 45.99, clothes));

        // Display all inventories
        System.out.println("Book Inventory:");
        InventoryUtils.displayInventory(bookInventory);
        System.out.println("\nElectronics Inventory:");
        InventoryUtils.displayInventory(electronicInventory);
        System.out.println("\nClothes Inventory:");
        InventoryUtils.displayInventory(clothesInventory);
    }
}


