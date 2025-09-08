package Battlefield;

import Troops.Troop;
import java.util.ArrayList;
import java.util.List;

public class Battlefield {
    private final List<List<Troop>> grid;

    public Battlefield(int size) {
        grid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            List<Troop> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add(null);
            }
            grid.add(row);
        }
    }

    public int getSize() {
        return grid.size();
    }

    public void placeTroop(Troop troop, int row, int col) {
        grid.get(row).set(col, troop);
    }
}
