package AlgoritmosEstrategy;

import TroopsFactory.Troops;

import java.util.List;

public interface EstrategyAlgoritm {

    <T extends Comparable<T>> void ordenarLista(List<Troops<T>> tropas);
}
