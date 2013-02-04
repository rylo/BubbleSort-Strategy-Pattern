import java.util.ArrayList;

public class BubbleSort {
    private SortStrategy strategy;

    void setSortStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(ArrayList collectionToSort){
        Object first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (collectionToSort.size() - 1); x++) {
                first = collectionToSort.get(x);
                second = collectionToSort.get(x+1);

                if (this.strategy.compare(first, second)) {
                    this.strategy.swap(x, collectionToSort, first, second);
                    swapHappened = true;
                }
            }
        }
        printArray(collectionToSort);
    }

    public final void printArray(ArrayList arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.size(); x++) {
            System.out.println(arrayToPrint.get(x));
        }
    }
}
