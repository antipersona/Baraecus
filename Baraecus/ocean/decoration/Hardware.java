package ocean.decoration;

import ocean.Default;
import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Hardware extends Default {
    
    private String[] names = { "pineapple", "rock", "shell", "oyster", "moai", "pitcher" };
    private String[] symbols = {"🍍", "🪨", "🐚", "🦪", "🗿", "🏺" };
    private int type;

    public Hardware(int x, int y, Ocean ocean) {
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
