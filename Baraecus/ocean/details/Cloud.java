package ocean.details;

import ocean.Default;


public class Cloud extends Default{

    public Cloud(int x, int y) {
        super(x, y);
        symbol = " ";
        name = "air";
    }

    @Override
    public double getProbabilityX(int quantity, int max_q) {
        if (quantity > max_q) {
            return 0;
        }
        return defGroupProbability;
    }

    @Override
    public double getProbabilityY(int quantity, int max_q) {
        if (quantity > max_q) {
            return 0;
        }
        return 0.1;
    }
    
}
