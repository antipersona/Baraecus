package ocean.landscape;

import ocean.Default;
import ocean.Ocean;

public class Air extends Default {

    public Air(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = " ";
        name = "air";
        on = false;
    }
}
