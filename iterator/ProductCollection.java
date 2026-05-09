package iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements Container {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Iterator createIterator() {
        return new InStockIterator(this);
    }
}
