package ocean.landscape;

import ocean.Default;
import ocean.Ocean;

public class Water extends Default {
    
    public Water(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = "🟦";
        name = "water";
        on = false;
    }
}