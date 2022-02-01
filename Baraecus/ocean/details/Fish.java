package ocean.details;

import ocean.Default;
import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Fish extends Default{
    private String[] names = { "fish0", "fish1", "fish2"};
    private String[] symbols = { "🐡", "🐠", "🐟"};
    private int type;

    public Fish(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        type = RandomNumbers.randInt(names.length - 1);
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
