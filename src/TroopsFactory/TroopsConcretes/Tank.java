package TroopsFactory.TroopsConcretes;

import TroopsFactory.Troops;

public class Tank<T extends Comparable<T>> extends Troops<T> {
    public Tank(String simbol, T range) {
        super(simbol, range);
    }
}
