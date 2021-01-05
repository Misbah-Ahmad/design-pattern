package iterator.exercise;

import java.util.List;

public class ProductIterator implements Iterator {

    private List<Product> productList;
    private int index = 0;

    public ProductIterator(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product next() {
        return hasNext() ? productList.get(index++) : null;
    }

    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

}
