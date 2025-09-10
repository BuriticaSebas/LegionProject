package TroopsFactory.TroopsConcretes;

import TroopsFactory.Troops;

public class Sniper<T extends Comparable<T>> extends Troops<T> {
    public Sniper(String simbol, T range) {
        super(simbol, range);
    }
}
