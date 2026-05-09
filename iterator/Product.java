package iterator;

public class Product {
	private String name;
    private boolean inStock;

    public Product(String name, boolean inStock) {
        this.name = name;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public boolean isInStock() {
        return inStock;
    }

}
