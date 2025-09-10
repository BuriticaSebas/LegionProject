package Builds;

import Singletons.SingletonMapArguments.MapWithArguments;
import TroopsFactory.Troops;
import java.util.List;

public class BuildOrientation {

    /**
     * Coloca las tropas en el campo de batalla según la orientación especificada
     * @param battlefield El campo de batalla donde colocar las tropas
     */
    public static void colocarTropasSegunOrientacion(String[][] battlefield) {
        String orientacion = MapWithArguments.getGlobalArguments().get("o");

        switch (orientacion.toLowerCase()) {
            case "n":
                Norte(battlefield);
                break;
            case "s":
                Sur(battlefield);
                break;
            case "e":
                Este(battlefield);
                break;
            case "w":
                Oeste(battlefield);
                break;
            default:
                System.out.println("Orientación no válida: " + orientacion);
                break;
        }
    }

    /**
     * Orientación Norte: Las tropas se colocan desde la fila inferior hacia arriba,
     * de izquierda a derecha, respetando el orden jerárquico.
     */
    public static void Norte(String[][] battlefield) {
        List<Troops<Integer>> tropasInt = BuildTroops.getListaTropasInteger();
        List<Troops<Character>> tropasChar = BuildTroops.getListaTropasCharacter();
        String tipoDatos = MapWithArguments.getGlobalArguments().get("t");
        List<?> tropas;
        if ("n".equals(tipoDatos)) {
            tropas = tropasInt;
        } else if ("c".equals(tipoDatos)) {
            tropas = tropasChar;
        } else {
            System.out.println("Tipo de datos no válido: " + tipoDatos);
            return;
        }
        int filaActual = battlefield.length - 1; // Comenzar desde la fila inferior
        int indiceTropa = 0;

        while (indiceTropa < tropas.size() && filaActual >= 0) {
            Troops<?> tropaActual = (Troops<?>) tropas.get(indiceTropa);
            String tipoTropaActual = tropaActual.getCharRepresentative();

            // Colocar todas las tropas del mismo tipo en la misma fila
            for (int columnaActual = 0; columnaActual < battlefield[0].length && indiceTropa < tropas.size(); columnaActual++) {
                Troops<?> tropa = (Troops<?>) tropas.get(indiceTropa);
                if (tropa.getCharRepresentative().equals(tipoTropaActual)) {
                    battlefield[filaActual][columnaActual] = tropa.getCharRepresentative();
                    indiceTropa++;
                } else {
                    break; // Cambiar de fila si el tipo de tropa es diferente
                }
            }
            filaActual--;
        }
    }

    /**
     * Orientación Sur: Las tropas se colocan desde la fila superior hacia abajo,
     * de izquierda a derecha, respetando el orden jerárquico.
     */
    public static void Sur(String[][] battlefield) {
        List<Troops<Integer>> tropasInt = BuildTroops.getListaTropasInteger();
        List<Troops<Character>> tropasChar = BuildTroops.getListaTropasCharacter();
        String tipoDatos = MapWithArguments.getGlobalArguments().get("t");
        List<?> tropas;
        if ("n".equals(tipoDatos)) {
            tropas = tropasInt;
        } else if ("c".equals(tipoDatos)) {
            tropas = tropasChar;
        } else {
            System.out.println("Tipo de datos no válido: " + tipoDatos);
            return;
        }
        int filaActual = 0; // Comenzar desde la fila superior
        int indiceTropa = 0;

        while (indiceTropa < tropas.size() && filaActual < battlefield.length) {
            Troops<?> tropaActual = (Troops<?>) tropas.get(indiceTropa);
            String tipoTropaActual = tropaActual.getCharRepresentative();

            // Colocar todas las tropas del mismo tipo en la misma fila
            for (int columnaActual = 0; columnaActual < battlefield[0].length && indiceTropa < tropas.size(); columnaActual++) {
                Troops<?> tropa = (Troops<?>) tropas.get(indiceTropa);
                if (tropa.getCharRepresentative().equals(tipoTropaActual)) {
                    battlefield[filaActual][columnaActual] = tropa.getCharRepresentative();
                    indiceTropa++;
                } else {
                    break; // Cambiar de fila si el tipo de tropa es diferente
                }
            }
            filaActual++;
        }
    }

    /**
     * Orientación Este: Las tropas se colocan desde la columna izquierda hacia la derecha,
     * de arriba hacia abajo, respetando el orden jerárquico.
     */
    public static void Este(String[][] battlefield) {
        List<Troops<Integer>> tropasInt = BuildTroops.getListaTropasInteger();
        List<Troops<Character>> tropasChar = BuildTroops.getListaTropasCharacter();
        String tipoDatos = MapWithArguments.getGlobalArguments().get("t");
        List<?> tropas;
        if ("n".equals(tipoDatos)) {
            tropas = tropasInt;
        } else if ("c".equals(tipoDatos)) {
            tropas = tropasChar;
        } else {
            System.out.println("Tipo de datos no válido: " + tipoDatos);
            return;
        }
        int columnaActual = 0; // Comenzar desde la primera columna
        int indiceTropa = 0;

        while (indiceTropa < tropas.size() && columnaActual < battlefield[0].length) {
            Troops<?> tropaActual = (Troops<?>) tropas.get(indiceTropa);
            String tipoTropaActual = tropaActual.getCharRepresentative();

            // Colocar todas las tropas del mismo tipo en la misma columna
            for (int filaActual = 0; filaActual < battlefield.length && indiceTropa < tropas.size(); filaActual++) {
                Troops<?> tropa = (Troops<?>) tropas.get(indiceTropa);
                if (tropa.getCharRepresentative().equals(tipoTropaActual)) {
                    battlefield[filaActual][columnaActual] = tropa.getCharRepresentative();
                    indiceTropa++;
                } else {
                    break; // Cambiar de columna si el tipo de tropa es diferente
                }
            }
            columnaActual++;
        }
    }

    /**
     * Orientación Oeste: Las tropas se colocan desde la esquina inferior derecha hacia la izquierda,
     * de abajo hacia arriba, respetando el orden jerárquico.
     */
    public static void Oeste(String[][] battlefield) {
        List<Troops<Integer>> tropasInt = BuildTroops.getListaTropasInteger();
        List<Troops<Character>> tropasChar = BuildTroops.getListaTropasCharacter();
        String tipoDatos = MapWithArguments.getGlobalArguments().get("t");
        List<?> tropas;
        if ("n".equals(tipoDatos)) {
            tropas = tropasInt;
        } else if ("c".equals(tipoDatos)) {
            tropas = tropasChar;
        } else {
            System.out.println("Tipo de datos no válido: " + tipoDatos);
            return;
        }
        int columnaActual = battlefield[0].length - 1; // Comenzar desde la última columna
        int indiceTropa = 0;

        while (indiceTropa < tropas.size() && columnaActual >= 0) {
            Troops<?> tropaActual = (Troops<?>) tropas.get(indiceTropa);
            String tipoTropaActual = tropaActual.getCharRepresentative();

            // Colocar todas las tropas del mismo tipo en la misma columna, desde abajo hacia arriba
            for (int filaActual = battlefield.length - 1; filaActual >= 0 && indiceTropa < tropas.size(); filaActual--) {
                Troops<?> tropa = (Troops<?>) tropas.get(indiceTropa);
                if (tropa.getCharRepresentative().equals(tipoTropaActual)) {
                    battlefield[filaActual][columnaActual] = tropa.getCharRepresentative();
                    indiceTropa++;
                } else {
                    break; // Cambiar de columna si el tipo de tropa es diferente
                }
            }
            columnaActual--;
        }
    }
}