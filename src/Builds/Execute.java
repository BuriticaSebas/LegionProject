package Builds;

import AlgoritmosEstrategy.ContextAlgorithm;
import AlgoritmosEstrategy.SubEstrategies.BubbleSort;
import AlgoritmosEstrategy.SubEstrategies.InsertionSort;
import AlgoritmosEstrategy.SubEstrategies.SelectionSort;
import Singletons.SingletonMapArguments.MapWithArguments;

public class Execute {

   public static void ExecuteSimulate(){
       //Resumen
       System.out.println("Algorithm: "   + MapWithArguments.getGlobalArguments().get("a"));
       System.out.println("Type: "        + MapWithArguments.getGlobalArguments().get("t"));
       System.out.println("Orientation: " + MapWithArguments.getGlobalArguments().get("o"));
       System.out.println("Troops: "      + MapWithArguments.getGlobalArguments().get("st"));
       System.out.println("Battlefield: " + MapWithArguments.getGlobalArguments().get("f"));

       System.out.println(" ");


       //Paso 1 - Creamos Las Tropas
       BuildTroops.crearTropas();
       System.out.println("Antes de Ordenar");
       BuildTroops.imprimirLista();
       System.out.println(" ");

       //Paso 2 - Ordenamos la Lista
       String parameterT = MapWithArguments.getGlobalArguments().get("t");
       String parameterA = MapWithArguments.getGlobalArguments().get("a");

       ContextAlgorithm algorithms = new ContextAlgorithm(new InsertionSort());


       if ("b".equals(parameterA)){
           algorithms.setStrategy(new BubbleSort());
       } else if ("s".equals(parameterA)) {
           algorithms.setStrategy(new SelectionSort());
       }

       long startTime = System.nanoTime();
       if ("n".equals(parameterT)){

           algorithms.implementsAlgorithm(BuildTroops.getListaTropasInteger());

       } else if ("c".equals(parameterT)) {
           algorithms.implementsAlgorithm(BuildTroops.getListaTropasCharacter());
       }
       long endTime = System.nanoTime();


       System.out.println("Despues de ordenar");
       BuildTroops.imprimirLista();
       System.out.println(" ");



       //Paso 3 - Creamos el battlefield de acuerdo al tamaño dado y llenamos
       // el battlefield de tropas aleatoriamente
       System.out.println("Antes de ordenar");
       BuildBattleField.createBattlefield();
       BuildBattleField.llenarPosicionesAleatorias();
       BuildBattleField.imprimirBattlefield();
       BuildBattleField.setBattlefield(BuildBattleField.createBattlefield());
       System.out.println(" ");

       System.out.println("Despues de Ordenar");
       //Paso 4 - Después de que la lista es ordenada procedemos a mostrar la matriz ordenada de acuerdo a la orientacion
       BuildOrientation.colocarTropasSegunOrientacion(BuildBattleField.getBattlefield());
       BuildBattleField.imprimirBattlefield();


       //Extra - Tiempo de ordenamiento
       long duracion =  endTime -startTime;      // diferencia en nanosegundos
       System.out.println("Tiempo de ordenamiento: " + duracion + " ns");

   }

}
