package ValidatorParams.Units;

import SingletonMapArguments.MapWithArguments;
import SingletonReceiveArguments.ReceiveArguments;

import java.util.Arrays;

public class ValidateUnits {

    public static String getinfoAlgorithm(){
        String[] argumentsAll = ReceiveArguments.getArgs();

        return argumentsAll[3];
    }

    public static void validateTypeandPresence() {
        String [] infoDesglosada = getinfoAlgorithm().split("=", 2);
        String presencia = infoDesglosada[0];
        String valor = infoDesglosada.length > 1 ? infoDesglosada[1] : "";

        if (presencia.isEmpty()) {
            System.out.println("No esta la presencia de unidades");
            System.exit(2);
        }

        if (valor.trim().isEmpty()) {
            System.out.println("Valor de unidades no permitido");
            System.exit(2);
        }

        String[] numbers = valor.split(",");
        if (numbers.length != 5) {
            System.out.println("Las unidades deben contener 5 valores");
            System.exit(2);
        }

        int total = 0;
        try {
            for (String n : numbers) {
                int num = Integer.parseInt(n.trim());
                if (num < 0) {
                    throw new NumberFormatException();
                }
                total += num;
            }
        } catch (NumberFormatException e) {
            System.out.println("Las unidades deben ser numeros enteros");
            System.exit(2);
        }

        if (total == 0) {
            System.out.println("Debe existir al menos una unidad");
            System.exit(2);
        }

        try {
            String campo = MapWithArguments.getGlobalArguments().get("f");
            int size = Integer.parseInt(campo.trim());
            if (total > size * size) {
                System.out.println("invalid battlefield size");
                System.exit(2);
            }
        } catch (Exception ignored) {
        }

        MapWithArguments.getGlobalArguments().put(presencia, valor);
    }
}
