package TroopsFactory.TroopsConcretes;

import Singletons.SingletonMapArguments.MapWithArguments;
import TroopsFactory.Troops;
// importa Comandante si no está en este paquete:
// import TroopsFactory.TroopsConcretes.Comandante;

public enum TroopsEnum {

    COMANDANTE {
        @Override
        public <T extends Comparable<T>> Troops<T> getInstance(T value) {
            return new Comandante<>("C", value);
        }
    },
    MEDIC {
        @Override
        public <T extends Comparable<T>> Troops<T> getInstance(T value) {
            return new Medic<>("M", value);
        }
    },
    INFANTERY {
        @Override
        public <T extends Comparable<T>> Troops<T> getInstance(T value) {
            return new Infantery<>("I", value);
        }
    },
    SNIPER {
        @Override
        public <T extends Comparable<T>> Troops<T> getInstance(T value) {
            return new Sniper<>("S", value);
        }
    },
    TANK {
        @Override
        public <T extends Comparable<T>> Troops<T> getInstance(T value) {
            return new Tank<>("T", value);
        }
    };






    public abstract <T extends Comparable<T>> Troops<T> getInstance(T value);
}

