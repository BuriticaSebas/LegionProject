import AlgoritmosEstrategy.ContextAlgorithm;
import AlgoritmosEstrategy.SubEstrategies.InsertionSort;
import Builds.BuildBattleField;
import Builds.BuildTroops;
import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

public class Main {
    public static void main(String[] args) {

        ReceiveArguments.getInstance(args);
        ReceiveArguments.activador();
        System.out.println(MapWithArguments.getGlobalArguments());

        BuildTroops.crearTropas();

        String parameterA = MapWithArguments.getGlobalArguments().get("a");

        System.out.println("lista caracter "+BuildTroops.getListaTropasCharacter());
        System.out.println("lista integer "+BuildTroops.getListaTropasInteger());


        BuildTroops.imprimirLista();
        if ("i".equals(parameterA)){
            ContextAlgorithm newContext = new ContextAlgorithm(new InsertionSort());
            newContext.implementsAlgorithm(BuildTroops.getListaTropasInteger());
        }

         BuildTroops.imprimirLista();

        BuildBattleField.llenarPosicionesAleatorias();
        BuildBattleField.imprimirBattlefield();


    }
}