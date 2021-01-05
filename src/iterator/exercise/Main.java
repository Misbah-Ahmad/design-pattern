package iterator.exercise;

import iterator.exercise.array_collection.ProductArray;

public class Main {
    public static void main(String[] args) {

        System.out.println("Simulate List");
        Collection<Product> collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));
        System.out.println("Size: " + collection.size());
        
        // Get List Iterator
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Simulate Array");
        Collection<Product> aProductArray = new ProductArray();
        aProductArray.add(new Product(1, "ar"));
        aProductArray.add(new Product(2, "br"));
        aProductArray.add(new Product(3, "cr"));

        System.out.println("Size: " + aProductArray.size());

        // Get Array Iterator
        Iterator aIterator = aProductArray.getIterator();

        while (aIterator.hasNext()) {
            System.out.println(aIterator.next());
        }
    }
}
