package ocean.details;

import ocean.Default;
import ocean.random.RandomNumbers;

public class Crab extends Default {

    private String[] names = { "locus", "crab" };
    private String[] symbols = { "🦞", "🦀" };
    private int type;

    public Crab(int x, int y) {
        super(x, y);
        type = (int) Math.round(RandomNumbers.randFreq());
        name = getName();
        symbol = getSymbol();
    }
    

    public String getName() {
        return names[type];
    }

    public String getSymbol() {
        return symbols[type];
    }
}
