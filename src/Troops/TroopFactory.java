package Troops;

import java.util.ArrayList;
import java.util.List;

public class TroopFactory {
    private static final String[] TYPES = {"infantry", "archer", "cavalry", "special", "support"};

    public List<Troop> createTroops(String units) {
        List<Troop> troops = new ArrayList<>();
        String[] counts = units.split(",");
        for (int i = 0; i < counts.length && i < TYPES.length; i++) {
            int count = Integer.parseInt(counts[i].trim());
            for (int j = 0; j < count; j++) {
                troops.add(new Troop(TYPES[i]));
            }
        }
        return troops;
    }
}
