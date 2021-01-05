package iterator.exercise;

public interface Collection<T> {
    public Iterator getIterator();
    public void add(T item);
    public int size();
    public boolean isEmpty();
}
