package ocean.decoration;

import ocean.Default;
import ocean.random.RandomNumbers;

public class Alga extends Default{
    private String[] names = { "alga0", "alga1" };
    private String[] symbols = { "🌵", "☘️" };
    private int type;

    public Alga(int x, int y) {
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

    @Override
    public double getProbabilityX(int quantity, int max_q) {
        if (quantity > max_q) {
            return 0;
        }
        return 0.1;
    }

    @Override
    public double getProbabilityY(int quantity, int max_q) {
        if (quantity > max_q) {
            return 0;
        }
        return defGroupProbability;
    }
}
