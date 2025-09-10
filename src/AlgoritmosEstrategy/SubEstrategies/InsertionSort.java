package AlgoritmosEstrategy.SubEstrategies;

import AlgoritmosEstrategy.EstrategyAlgoritm;
import TroopsFactory.Troops;
import java.util.List;

public class InsertionSort implements EstrategyAlgoritm {
    @Override
    public <T extends Comparable<T>> void ordenarLista(List<Troops<T>> a) {
        for (int i = 1; i < a.size(); i++) {
            Troops<T> key = a.get(i);
            int j = i - 1;
            while (j >= 0 && a.get(j).getRange().compareTo(key.getRange()) > 0) {
                a.set(j + 1, a.get(j));
                j--;
            }
            a.set(j + 1, key);
        }
    }
}


