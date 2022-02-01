package ocean.details;

import ocean.Default;
import ocean.Ocean;

public abstract class Animal extends Default{

protected boolean lungs = false, water = false, air = false, waves = false, floor= false; 

    public Animal(int x, int y, Ocean ocean) {
        super(x, y, ocean);
    }

}
