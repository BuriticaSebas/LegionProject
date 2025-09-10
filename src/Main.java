import AlgoritmosEstrategy.ContextAlgorithm;
import AlgoritmosEstrategy.SubEstrategies.InsertionSort;
import Builds.BuildBattleField;
import Builds.BuildTroops;
import Builds.Execute;
import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

public class Main {
    public static void main(String[] args) {

        ReceiveArguments.getInstance(args);
        ReceiveArguments.activador();
        Execute.ExecuteSimulate();
    }
}

