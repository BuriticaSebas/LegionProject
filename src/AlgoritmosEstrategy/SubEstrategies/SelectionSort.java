package AlgoritmosEstrategy.SubEstrategies;

import AlgoritmosEstrategy.EstrategyAlgoritm;
import TroopsFactory.Troops;

import java.util.Collections;
import java.util.List;

public class SelectionSort implements EstrategyAlgoritm {
    @Override
    public <T extends Comparable<T>> void ordenarLista(List<Troops<T>> a) {
        if (a == null || a.size() < 2) return;

        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a.get(j).getRange().compareTo(a.get(minIdx).getRange()) < 0) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Collections.swap(a, i, minIdx);
            }
        }
    }
}
