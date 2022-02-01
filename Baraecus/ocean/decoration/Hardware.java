package ocean.decoration;

import ocean.Default;
import ocean.random.RandomNumbers;

public class Hardware extends Default {
    
    private String[] names = { "pineapple", "rock", "shell", "oyster", "moai", "pitcher" };
    private String[] symbols = {"🍍", "🪨", "🐚", "🦪", "🗿", "🏺" };
    private int type;

    public Hardware(int x, int y) {
        super(x, y);
        type = (int) Math.round(RandomNumbers.randFreq() * 5);
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
