package TroopsFactory;

public class Troops<T extends Comparable<T>>{

    private final String charRepresentative;
    private final T range;


    public Troops(String simbol, T range){
        charRepresentative = simbol;
        this.range = range;
    }

    public String getCharRepresentative() {
        return charRepresentative;
    }

    public T getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Troops{" +
                "CharRepresentative='" + charRepresentative + '\'' +
                '}';
    }

}
