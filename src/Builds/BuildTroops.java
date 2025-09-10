package Builds;

import Singletons.SingletonMapArguments.MapWithArguments;
import TroopsFactory.TroopsFactory;
import TroopsFactory.Troops;

import java.util.ArrayList;
import java.util.List;

public class BuildTroops {
    private static final TroopsFactory factoryTroops = new TroopsFactory();
    private static final   List<Troops<Integer>> listaTropasInteger = new ArrayList<>();
    private static final List<Troops<Character>> listaTropasCharacter = new ArrayList<>();

    public static List<Troops<Character>> getListaTropasCharacter() {
        return listaTropasCharacter;
    }

    public static List<Troops<Integer>> getListaTropasInteger() {
        return listaTropasInteger;
    }

    public static void crearTropas() {
        String unidadesString = MapWithArguments.getGlobalArguments().get("u");
        String[] partes = unidadesString.split(",");
        int[] unidadesInt = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            unidadesInt[i] = Integer.parseInt(partes[i].trim());
            System.out.println(unidadesInt[i]);
        }

        int cantidadComandante = unidadesInt[0];
        int cantidadMedicos = unidadesInt[1];
        int cantidadTanques = unidadesInt[2];
        int cantidadSnipers = unidadesInt[3];
        int cantidadInfanters = unidadesInt[4];


        String parameterT = MapWithArguments.getGlobalArguments().get("t");

        // Para Integer
        if ("n".equals(parameterT)) {
            for (int i = 0; i < cantidadComandante; i++) {
                listaTropasInteger.add(factoryTroops.getTypeTroop("COMANDANTE", 10));
            }

            for (int i = 0; i < cantidadMedicos; i++) {
                listaTropasInteger.add(factoryTroops.getTypeTroop("MEDIC", 20));
            }

            for (int i = 0; i < cantidadTanques; i++) {
                listaTropasInteger.add(factoryTroops.getTypeTroop("TANK", 30));
            }

            for (int i = 0; i < cantidadSnipers; i++) {
                listaTropasInteger.add(factoryTroops.getTypeTroop("SNIPER", 40));
            }

            for (int i = 0; i < cantidadInfanters; i++) {
                listaTropasInteger.add(factoryTroops.getTypeTroop("INFANTERY", 50));
            }


        }

        // Para Character
        if ("c".equals(parameterT)) {


            for (int i = 0; i < cantidadMedicos; i++) {
                listaTropasCharacter.add(factoryTroops.getTypeTroop("MEDIC", 'k'));
            }

            for (int i = 0; i < cantidadInfanters; i++) {
                listaTropasCharacter.add(factoryTroops.getTypeTroop("INFANTERY", 'O'));
            }



            for (int i = 0; i < cantidadSnipers; i++) {
                listaTropasCharacter.add(factoryTroops.getTypeTroop("SNIPER", 'K'));
            }

            for (int i = 0; i < cantidadTanques; i++) {
                listaTropasCharacter.add(factoryTroops.getTypeTroop("TANK", 'u'));
            }


            for (int i = 0; i < cantidadComandante; i++) {
                listaTropasCharacter.add(factoryTroops.getTypeTroop("COMANDANTE", 'a'));
            }

        }




    }

    public static void imprimirLista(){
        if ("c".equals(MapWithArguments.getGlobalArguments().get("t"))){
            System.out.println(listaTropasCharacter);
            /*for (Troops<Character> troops : listaTropasCharacter) {
                System.out.println("tropas: " + troops.getCharRepresentative() + " " + troops.getRange());
            }*/
        }



        if ("n".equals(MapWithArguments.getGlobalArguments().get("t"))){
            System.out.println(listaTropasInteger);
//            for (Troops<Integer> troops : listaTropasInteger) {
//                System.out.println("tropas: " + troops.getCharRepresentative());
//            }
        }

    }



}
