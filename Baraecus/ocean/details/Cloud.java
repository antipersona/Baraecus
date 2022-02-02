package ocean.details;

import ocean.Default;
import ocean.Ocean;


public class Cloud extends Default{

    public Cloud(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = " ";
        name = "air";
    }

    @Override
    public double getProbabilityX(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return defGroupProbability;
    }

    @Override
    public double getProbabilityY(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return 0.1;
    }
    
}
