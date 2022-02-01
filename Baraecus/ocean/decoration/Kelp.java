package ocean.decoration;

import ocean.Default;
import ocean.Ocean;

public class Kelp extends Default {

    public Kelp(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        name = "kelp";
        symbol = "K";
    }

    @Override
    public double getProbabilityX(int quantity, int max_q) {
        return 0;
    }

    @Override
    public double getProbabilityY(int quantity, int max_q) {

        if (quantity > max_q) {
            return 0;
        }
          
        return defGroupProbability + 1/quantity - 0.1;
    }
    
}
