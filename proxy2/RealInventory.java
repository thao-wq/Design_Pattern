package proxy2;

import java.util.ArrayList;
import java.util.List;

public class RealInventory implements Inventory {

    private List<String> items;

    public RealInventory() {
        loadFromDatabase(); 
    }

    private void loadFromDatabase() {
        System.out.println("Loading inventory from database...");

        items = new ArrayList<>();
        items.add("Milk");
        items.add("Bread");
        items.add("Eggs");
        items.add("Rice");
        items.add("Meat");
    }

    @Override
    public List<String> getItems() {
        return items;
    }
}