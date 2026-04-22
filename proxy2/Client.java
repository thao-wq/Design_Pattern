package proxy2;

public class Client {

    public static void main(String[] args) {

        Inventory inventory = new InventoryProxy(); 

        System.out.println("Application started...");


        System.out.println("Doing other tasks...");


        System.out.println("Access inventory:");
        System.out.println(inventory.getItems());
    }
}
