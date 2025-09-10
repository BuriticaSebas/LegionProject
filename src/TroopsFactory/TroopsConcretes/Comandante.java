package TroopsFactory.TroopsConcretes;

import TroopsFactory.Troops;

public class Comandante<T extends Comparable<T>> extends Troops<T> {
    public Comandante(String simbol, T range) {
        super(simbol, range);
    }
}
