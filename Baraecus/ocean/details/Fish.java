package ocean.details;


import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Fish extends Animal{
    private String[] names = { "fish0", "fish1", "fish2"};
    private String[] symbols = { "🐡", "🐠", "🐟"};
    private int type;

    public Fish(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        type = RandomNumbers.randInt(names.length - 1);
        name = getName();
        symbol = getSymbol();
        water = true;
    }

    public String getName() {
        return names[type];
    }

    public String getSymbol() {
        return symbols[type];
    }
}
