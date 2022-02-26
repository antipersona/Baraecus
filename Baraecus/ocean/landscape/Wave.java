package ocean.landscape;

import ocean.Default;
import ocean.Ocean;

public class Wave extends Default{
    public Wave(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = "🌊";
        name = "Wave";
        on = false;
    }
}
