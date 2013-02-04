import java.util.ArrayList;

public class FloatSortStrategy implements SortStrategy<Float> {
    @Override
    public void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = ((Number) first).floatValue();
        second = ((Number) second).floatValue();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

    @Override
    public boolean compare(Float first, Float second) {
        return first > second;
    }
}
