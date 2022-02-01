package ocean.details;

import ocean.Default;
import ocean.random.RandomNumbers;

public class Fish extends Default{
    private String[] names = { "fish0", "fish1", "fish2", "oyster", "moai", "pitcher" };
    private String[] symbols = { "🐡", "🐠", "🐟", "🦪", "🗿", "🏺" };
    private int type;

    public Fish(int x, int y) {
        super(x, y);
        type = (int) Math.round(RandomNumbers.randFreq() * 2);
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
