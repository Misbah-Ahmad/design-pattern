package iterator.exercise.array_collection;

import iterator.exercise.Collection;
import iterator.exercise.Iterator;
import iterator.exercise.Product;

public class ProductArray implements Collection<Product> {
    private Product[] products = new Product[100];
    private int index = 0;

    @Override
    public Iterator getIterator() {
        return new ArrayIterator(products);
    }

    @Override
    public void add(Product item) {
        products[index++] = item;
    }

    @Override
    public int size() {
        return index; // Index is always 1 step ahead, no need to add 1.
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

}
