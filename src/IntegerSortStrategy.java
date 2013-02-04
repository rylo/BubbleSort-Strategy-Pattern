import java.util.ArrayList;

public class IntegerSortStrategy implements SortStrategy<Integer> {
    @Override
    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = ((Number) first).intValue();
        second = ((Number) second).intValue();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

    @Override
    public boolean compare(Integer first, Integer second) {
        return first > second;
    }
}