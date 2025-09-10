package TroopsFactory;

import Singletons.SingletonMapArguments.MapWithArguments;
import TroopsFactory.TroopsConcretes.TroopsEnum;

public class TroopsFactory {

    public  <T extends Comparable<T>> Troops<T> getTypeTroop(String typeTroop,T valueRange){

        if (typeTroop == null){
            return null;
        }
        try {

            TroopsEnum factoryTroops = TroopsEnum.valueOf(typeTroop.toUpperCase());

            return factoryTroops.getInstance(valueRange);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    };
}

