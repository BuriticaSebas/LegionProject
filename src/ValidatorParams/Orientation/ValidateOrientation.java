package ValidatorParams.Orientation;

import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

import java.util.HashMap;
import java.util.Map;

public class ValidateOrientation {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();
        return argumentsAll[2];
    }

    public static void validateTypeandPresence() {

        Map<Integer, String > listaPermitidaOrientation = new HashMap<>();

        listaPermitidaOrientation.put(1,"n");
        listaPermitidaOrientation.put(2,"s");
        listaPermitidaOrientation.put(3,"e");
        listaPermitidaOrientation.put(4,"w");

        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada[1].toLowerCase().replace(",", "");

        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia de la Orientacion");
            System.exit(2);
        }

        if(!listaPermitidaOrientation.containsValue(valor)){
            System.out.println("Valor de la orientacion no permitido");
            System.exit(2);
        }

        MapWithArguments.getGlobalArguments().put(presencia, valor);



    }

}
