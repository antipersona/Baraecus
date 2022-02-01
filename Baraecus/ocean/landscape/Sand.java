package ocean.landscape;

import ocean.Default;
import ocean.Ocean;

public class Sand extends Default {
    
    public Sand(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = "🟫";
        name = "sand";
        on = false;
    }

}
