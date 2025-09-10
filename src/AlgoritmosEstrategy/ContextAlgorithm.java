package AlgoritmosEstrategy;

import TroopsFactory.Troops;

import java.util.List;

public class ContextAlgorithm {
    EstrategyAlgoritm strategyOrder;

    public ContextAlgorithm(EstrategyAlgoritm strategyOrdered){
        this.strategyOrder = strategyOrdered;
    }

    public void setStrategy(EstrategyAlgoritm newStrategy) {
        this.strategyOrder = newStrategy;
    }


    public <T extends Comparable<T>> void implementsAlgorithm(List<Troops<T>> listaParaOrdenar){
        strategyOrder.ordenarLista(listaParaOrdenar);
    }
}
