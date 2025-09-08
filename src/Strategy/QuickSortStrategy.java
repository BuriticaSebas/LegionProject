package Strategy;

import java.util.Collections;
import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(List<Integer> data) {
        Collections.sort(data);
    }
}
