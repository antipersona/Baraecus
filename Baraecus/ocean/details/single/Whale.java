package ocean.details.single;

import ocean.Groups;

public class Whale extends Organism implements Groups {

    public Whale() {
        lungs = true;
        water = true;
        air = true;
        groups = true;
    }

    @Override
    public float getProbability(int quantity, int max_q) {
        // TODO Auto-generated method stub
        return 0;
    }
}
