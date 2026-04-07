// After Refactoring - Inventory System (Better OOP Design)
import java.util.ArrayList;
import java.util.List;

// Represent an Item as an Object
class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return name + " - Quantity: " + quantity;
    }
}

// Inventory Manager Class
class InventoryManager {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void updateQuantity(String itemName, int qty) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                item.setQuantity(qty);
                break;
            }
        }
    }
}

public class AfterInventoryDemo {
    public static void main(String[] args) {
        InventoryManager inv = new InventoryManager();

        inv.addItem(new Item("Laptop", 10));
        inv.addItem(new Item("Phone", 20));
        inv.displayItems();

        inv.updateQuantity("Laptop", 15);
        System.out.println("\nAfter updating Laptop:");
        inv.displayItems();
    }
}
