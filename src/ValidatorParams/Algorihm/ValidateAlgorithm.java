package ValidatorParams.Algorihm;

import SingletonMapArguments.MapWithArguments;
import SingletonReceiveArguments.ReceiveArguments;

import java.util.HashMap;
import java.util.Map;

public class ValidateAlgorithm {

    public static String getinfoAlgorithm(){
     String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[0];
    }

    public static void validateTypeandPresence() {

        Map<Integer, String> listaPermitida = new HashMap<>();

        listaPermitida.put(1, "q");
        listaPermitida.put(2, "b");
        listaPermitida.put(3, "i");

        String [] infodesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infodesglosada[0];
        String valor = infodesglosada[1].toLowerCase().trim().replaceAll("[^a-z]", "");


        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia del algoritmo");
            System.exit(2);
        }

        if(!listaPermitida.containsValue(valor)){
            System.out.println("Valor de algoritmo no permitido");
            System.exit(2);
        }
        MapWithArguments.getGlobalArguments().put(presencia,valor);

    }

}
