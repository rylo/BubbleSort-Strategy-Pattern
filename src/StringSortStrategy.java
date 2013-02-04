import java.util.ArrayList;

public class StringSortStrategy implements SortStrategy<String> {
    @Override
    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = first.toString();
        second = second.toString();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

    @Override
    public boolean compare(String first, String second) {
        return first.compareToIgnoreCase(second) > 0;
    }
}