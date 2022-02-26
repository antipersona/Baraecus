package ocean.details;

import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Crab extends Animal {

    private String[] names = { "locus", "crab" };
    private String[] symbols = { "🦞", "🦀" };
    private int type;

    public Crab(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        type = RandomNumbers.randInt(names.length - 1);
        name = getName();
        symbol = getSymbol();
        floor = true;

    }

    public String getName() {
        return names[type];
    }

    public String getSymbol() {
        return symbols[type];
    }
}
