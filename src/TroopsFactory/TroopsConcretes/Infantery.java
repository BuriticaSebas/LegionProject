package TroopsFactory.TroopsConcretes;

import TroopsFactory.Troops;

public class Infantery<T extends Comparable<T>> extends Troops<T> {
    public Infantery(String simbol, T range) {
        super(simbol, range);
    }
}
