package AlgoritmosEstrategy.SubEstrategies;

import AlgoritmosEstrategy.EstrategyAlgoritm;
import TroopsFactory.Troops;

import java.util.Collections;
import java.util.List;

public class BubbleSort implements EstrategyAlgoritm {
    @Override
    public <T extends Comparable<T>> void ordenarLista(List<Troops<T>> a) {
        if (a == null || a.size() < 2) return;

        boolean swapped;
        for (int n = a.size(); n > 1; n--) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (a.get(i - 1).getRange().compareTo(a.get(i).getRange()) > 0) {
                    Collections.swap(a, i - 1, i);
                    swapped = true;
                }
            }
            if (!swapped) return; // ya está ordenado
        }
    }
}
