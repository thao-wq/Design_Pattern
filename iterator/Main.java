package iterator;

public class Main {

    public static void main(String[] args) {

        ProductCollection collection = new ProductCollection();

        collection.addProduct(new Product("Laptop", true));
        collection.addProduct(new Product("Mouse", false));
        collection.addProduct(new Product("Keyboard", true));
        collection.addProduct(new Product("Monitor", false));
        collection.addProduct(new Product("Headphone", true));

        Iterator iterator = collection.createIterator();

        System.out.println("Products in stock:");

        while(iterator.hasNext()) {

            Product p = iterator.next();

            System.out.println(p.getName());
        }
    }
}
