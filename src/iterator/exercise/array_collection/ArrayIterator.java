package iterator.exercise.array_collection;

import iterator.exercise.Iterator;
import iterator.exercise.Product;

public class ArrayIterator implements Iterator {

    private Product[] productList = new Product[100];
    private int index = 0;
    private int count;

    public ArrayIterator(Product[] productList) {
        this.productList = productList;
        int temp = 0;
        while(productList[temp++] != null);
        count = temp - 1;
    }

    @Override
    public Product next() {
        return hasNext() ? productList[index++] : null;
    }

    @Override
    public boolean hasNext() {
        return index < count;
    }

}
