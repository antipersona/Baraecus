package ocean.details;

import ocean.Ocean;

public class Whale extends Animal{

    public Whale(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        lungs = true;
        water = true;
        air = true;
    }

    @Override
    public double getProbabilityX(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return defGroupProbability - 0.1;
    }

    @Override
    public double getProbabilityY(int grow_cycle) {
        if (grow_cycle > max_q) {
            return 0;
        }
        return defGroupProbability - 0.1;
    }

}
