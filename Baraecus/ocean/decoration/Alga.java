package ocean.decoration;

import ocean.Default;
import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Alga extends Default{
    private String[] names = { "alga0", "alga1" };
    private String[] symbols = { "🌵", "☘️" };
    private int type;
    private final int max_q = 5;

    public Alga(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        type = RandomNumbers.randInt(names.length - 1);
        name = getName();
        symbol = getSymbol();
    }

    public String getName() {
        return names[type];
    }

    public String getSymbol() {
        return "A";
        //return symbols[type];
    }

    @Override
    public double getProbabilityX(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return 0.1;
    }

    @Override
    public double getProbabilityY(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return 0.2;
    }
}
