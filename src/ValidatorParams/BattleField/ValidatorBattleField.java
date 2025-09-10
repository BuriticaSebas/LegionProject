package ValidatorParams.BattleField;

import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

public class ValidatorBattleField {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[4];
    }

    public static void validateTypeandPresence() {

        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada[1].toLowerCase().replace(",", "");

        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia del tamaño del campo de batalla");
            System.exit(2);
        }

        try{
            if (valor.isEmpty()){
                valor = "10";
                MapWithArguments.getGlobalArguments().put(presencia,valor);
            }


            int tamanoCampo = Integer.parseInt(valor.trim());


            if(tamanoCampo < 5 || tamanoCampo > 1000){
                System.out.println("El valor debe estar entre 5 y 1000");
                System.exit(2);
            }


        } catch (Exception e) {
            System.out.println("El campo debe tener un numero");
            System.exit(2);
        }


        MapWithArguments.getGlobalArguments().put(presencia, valor);
    }


}
