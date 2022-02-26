package ocean.details;

import ocean.Default;
import ocean.Ocean;

public abstract class Animal extends Default {

protected boolean air = false,  water = false,  floor = false,  jumps = false,  surface = false;

    public Animal(int x, int y, Ocean ocean) {
        super(x, y, ocean);
    }

    public boolean isaGoodPos(int y, Ocean ocean) {
        return ocean.isAir(y) && air || ocean.isUnderWater() && water
        return          ocean.getWaves(y) && surface 
    }

    /*
    protected void characteristics(boolean air, boolean water, boolean floor, boolean jumps, boolean surface) {
        this.air = air;
        this.water = water;
        this.floor = floor;
        this.jumps = jumps;
        this.surface = surface;
    }
    */

}
