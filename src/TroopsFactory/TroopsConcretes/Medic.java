package TroopsFactory.TroopsConcretes;

import TroopsFactory.Troops;

public class Medic<T extends Comparable<T>> extends Troops<T> {
    public Medic(String simbol, T range) {
        super(simbol, range);
    }
}
