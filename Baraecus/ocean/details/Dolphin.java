package ocean.details;

import ocean.Ocean;

public class Dolphin extends Animal{

    public Dolphin(int x, int y, Ocean ocean) {
        super(x, y, ocean);
        symbol = "🐬";
        name = "Dolphin";
        water = true;
        jumps = true;
        surface = true;
    }
    
}
