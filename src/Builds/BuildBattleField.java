package Builds;

import Singletons.SingletonMapArguments.MapWithArguments;
import TroopsFactory.Troops;

import java.util.List;
import java.util.Random;

public class BuildBattleField {

    private static final String[][] battlefield = createBattlefield();

    public static String[][] createBattlefield(){

        int size = Integer.parseInt(MapWithArguments.getGlobalArguments().get("f"));

        String[][] battlefield = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                battlefield[i][j] = "*"; // Inicializar con "*"
            }
        }

        return battlefield;
    }

    public static void imprimirBattlefield() {
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                System.out.print(battlefield[i][j] + " ");
            }
            System.out.println(); // salto de línea después de cada fila
        }
    }

    public static void llenarPosicionesAleatorias() {
        List<Troops<Integer>> listaMela = BuildTroops.getListaTropasInteger();
        Random random = new Random();

        int size = battlefield.length;

        for (Troops<Integer> tropa : listaMela) {
            boolean colocado = false;

            while (!colocado) {
                int fila = random.nextInt(size); // coordenada aleatoria en Y
                int col = random.nextInt(size);  // coordenada aleatoria en X

                if ("*".equals(battlefield[fila][col])) {
                    // Aquí decides qué mostrar (por ejemplo el rango de la tropa)
                    battlefield[fila][col] = tropa.getCharRepresentative();
                    colocado = true;
                }
            }
        }
    }
}
