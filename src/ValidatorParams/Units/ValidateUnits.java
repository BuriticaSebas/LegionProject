
package ValidatorParams.Units;

import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

public class ValidateUnits {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[3];
    }

    public static void validateTypeandPresence() {

        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada[1];


        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia de las Unidades");
            System.exit(2);
        }



        try{
            String [] partes = valor.split(",");
            int[] numeros = new int[partes.length];

            //Convertimos cada pedacito a Int
            for (int i = 0; i < partes.length; i++) {
                numeros[i] = Integer.parseInt(partes[i].trim());
            }


            String tomandoValordeMapa = MapWithArguments.getGlobalArguments().get("sizeMapa");



        }catch (Exception e){
            System.out.println("Error en el parametro De Unidades");
            System.out.println(e.getMessage());
        }

    }
}
