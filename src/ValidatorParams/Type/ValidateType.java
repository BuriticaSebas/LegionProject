package ValidatorParams.Type;

import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

import java.util.HashMap;
import java.util.Map;

public class ValidateType {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[1];
    }

    public static void validateTypeandPresence() {

        Map<Integer, String> listaPermitida2 = new HashMap<>();

        listaPermitida2.put(1, "n");
        listaPermitida2.put(2, "c");

        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada[1].toLowerCase().replace(",", "");

        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia del Tipo de dato");
            System.exit(2);
        }
        if(!listaPermitida2.containsValue(valor)){
            System.out.println("Valor del tipo no permitido");
            System.exit(2);
        }

        MapWithArguments.getGlobalArguments().put(presencia, valor);
    }
}
