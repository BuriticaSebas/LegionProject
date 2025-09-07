package ValidatorParams.Units;

import SingletonMapArguments.MapWithArguments;
import SingletonReceiveArguments.ReceiveArguments;

import java.util.HashMap;
import java.util.Map;

public class ValidateUnits {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[3];
    }

    public static void validateTypeandPresence() {

        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada[1];

        System.out.println(valor);



    }
}
