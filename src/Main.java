import SingletonMapArguments.MapWithArguments;
import SingletonReceiveArguments.ReceiveArguments;

import Battlefield.Battlefield;
import Strategy.SortingStrategy;
import Strategy.SortingStrategyFactory;
import Troops.Troop;
import Troops.TroopFactory;
import Simulator.Simulator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Recibir parametros
        //Validar parametros
        //Desglosar cada parametro y ejecutarse de acuerdo al parametro

        ReceiveArguments.getInstance(args);
        ReceiveArguments.activador();

        Map<String, String> argumentos = MapWithArguments.getGlobalArguments();

        String algorithm = argumentos.getOrDefault("a", "");
        String type = argumentos.getOrDefault("t", "");
        String orientation = argumentos.getOrDefault("o", "");
        String units = argumentos.getOrDefault("u", "0,0,0,0,0");
        String field = argumentos.getOrDefault("f", "10");

        int totalTroops = Arrays.stream(units.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Algorithm: [" + nombreAlgoritmo(algorithm) + "]");
        System.out.println("Type: [" + nombreTipo(type) + "]");
        System.out.println("Orientation: [" + nombreOrientacion(orientation) + "]");
        System.out.println("Troops: [" + totalTroops + "]");
        System.out.println("Battlefield: [" + field + " x " + field + "]");

        TroopFactory troopFactory = new TroopFactory();
        List<Troop> troopList = troopFactory.createTroops(units);
        Battlefield battlefield = new Battlefield(Integer.parseInt(field));
        SortingStrategy strategy = SortingStrategyFactory.create(algorithm);

        Simulator simulator = new Simulator.Builder()
                .battlefield(battlefield)
                .troops(troopList)
                .strategy(strategy)
                .build();

        System.out.println("Simulator initialized with " + simulator.getTroops().size() + " troops");
    }

    private static String nombreAlgoritmo(String valor) {
        switch (valor) {
            case "q":
                return "Quick sort";
            case "b":
                return "Bubble sort";
            case "i":
                return "Insertion sort";
            case "m":
                return "Merge sort";
            case "s":
                return "Selection sort";
            case "h":
                return "Heap sort";
            case "c":
                return "Counting sort";
            case "r":
                return "Radix sort";
            default:
                return valor;
        }
    }

    private static String nombreTipo(String valor) {
        return valor.equals("c") ? "Character" : "Number";
    }

    private static String nombreOrientacion(String valor) {
        switch (valor) {
            case "n":
                return "North";
            case "s":
                return "South";
            case "e":
                return "East";
            case "w":
                return "West";
            default:
                return "invalid";
        }
    }
}