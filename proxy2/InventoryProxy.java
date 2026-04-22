package proxy2;

import java.util.List;

public class InventoryProxy implements Inventory {

    private RealInventory realInventory;

    @Override
    public List<String> getItems() {

        if (realInventory == null) {
            realInventory = new RealInventory(); 
        }

        return realInventory.getItems();
    }
}
