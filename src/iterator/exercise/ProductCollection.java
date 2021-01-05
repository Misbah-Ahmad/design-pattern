package iterator.exercise;

import java.util.ArrayList;
import java.util.List;
public class ProductCollection implements Collection<Product> {
  private List<Product> products = new ArrayList<>();

  @Override
  public Iterator getIterator() {
    return new ProductIterator(products);
  }

  @Override
  public void add(Product item) {
    products.add(item);
  }

  @Override
  public int size() {
    return products.size();
  }

  @Override
  public boolean isEmpty() {
    return products.size() == 0;
  }

}
