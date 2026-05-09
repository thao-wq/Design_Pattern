package iterator;

public class InStockIterator implements Iterator {

    private ProductCollection collection;
    private int index = 0;

    public InStockIterator(ProductCollection collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {

        while(index < collection.getProducts().size()) {

            if(collection.getProducts().get(index).isInStock()) {
                return true;
            }

            index++;
        }

        return false;
    }

    @Override
    public Product next() {

        return collection.getProducts().get(index++);
    }
}
