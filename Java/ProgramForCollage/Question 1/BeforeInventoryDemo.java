// Before Refactoring - Inventory System (Bad OOP Design)
import java.util.ArrayList;
import java.util.List;

class InventorySystem {
    private List<String> items = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();

    // Add item
    public void addItem(String item, int qty) {
        items.add(item);
        quantities.add(qty);
    }

    // Display items
    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - Quantity: " + quantities.get(i));
        }
    }

    // Update quantity
    public void updateQuantity(String item, int qty) {
        int index = items.indexOf(item);
        if (index != -1) {
            quantities.set(index, qty);
        }
    }
}

public class BeforeInventoryDemo {
    public static void main(String[] args) {
        InventorySystem inv = new InventorySystem();

        inv.addItem("Laptop", 10);
        inv.addItem("Phone", 20);
        inv.displayItems();

        inv.updateQuantity("Laptop", 15);
        System.out.println("\nAfter updating Laptop:");
        inv.displayItems();
    }
}
