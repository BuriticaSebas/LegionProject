package Simulator;

import Battlefield.Battlefield;
import Strategy.SortingStrategy;
import Troops.Troop;

import java.util.List;

public class Simulator {
    private final Battlefield battlefield;
    private final List<Troop> troops;
    private final SortingStrategy strategy;

    private Simulator(Builder builder) {
        this.battlefield = builder.battlefield;
        this.troops = builder.troops;
        this.strategy = builder.strategy;
    }

    public static class Builder {
        private Battlefield battlefield;
        private List<Troop> troops;
        private SortingStrategy strategy;

        public Builder battlefield(Battlefield battlefield) {
            this.battlefield = battlefield;
            return this;
        }

        public Builder troops(List<Troop> troops) {
            this.troops = troops;
            return this;
        }

        public Builder strategy(SortingStrategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public Simulator build() {
            return new Simulator(this);
        }
    }

    public Battlefield getBattlefield() {
        return battlefield;
    }

    public List<Troop> getTroops() {
        return troops;
    }

    public SortingStrategy getStrategy() {
        return strategy;
    }
}
