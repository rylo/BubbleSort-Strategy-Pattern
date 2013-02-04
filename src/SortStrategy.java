import java.util.ArrayList;

public interface SortStrategy<T> {
    public void swap(int index, ArrayList collectionToSort, Object first, Object second);
    public boolean compare(T first, T second);
}