
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
            int[] cantidadportropas = new int[partes.length];

            int sum = 0;
            //Convertimos cada pedacito a Int
            for (int i = 0; i < partes.length; i++) {
                cantidadportropas[i] = Integer.parseInt(partes[i].trim());
                sum = sum + cantidadportropas[i];
            }

            int sizeBattlefield = Integer.parseInt(MapWithArguments.getGlobalArguments().get("f"));
            int totalBattlefield = sizeBattlefield * sizeBattlefield;

            //Acá debo validar que la suma total de las unidades no supere el tamaño del battlefieldo fxf
            if(sum > totalBattlefield){
                System.out.println("Error: El numero total de Unidades es mayor al campo de Batalla ");
                System.exit(2);
            }

            //Aca valida que el tamaño totala de cantidadportropas sea igual a 5
            if(cantidadportropas.length != 5){
                System.out.println("La cantidad de tropas es Incorrecta");
                System.exit(2);
            }

            //Aca valida el valor de la cantidad de tropa
            for (int unidadesTroops: cantidadportropas){
                if (unidadesTroops < 1 || unidadesTroops > sizeBattlefield){
                    System.out.println("La cantidad de Alguna tropa es incorrecta");
                    System.exit(2);
                }
            }

            MapWithArguments.getGlobalArguments().put("u", valor);

        }catch (Exception e){
            System.out.println("Error en el parametro De Unidades");
            System.out.println(e.getMessage());
        }

    }
}
