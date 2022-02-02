package ocean.decoration;

import java.util.Random;

import ocean.Default;
import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Kelp extends Default {

    public Kelp(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        name = "kelp";
        symbol = "K";
    }

    @Override
    public double getProbabilityX(int grow_cycle) {
        return 0;
    }

    @Override
    public double getProbabilityY(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return defGroupProbability + 0.1 - RandomNumbers.randFreq()/2 + RandomNumbers.randFreq()/2;
    }
    
}
