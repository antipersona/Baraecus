package ocean;

import ocean.random.RandomNumbers;

public class Ocean {     //se encarga de crear el oceano

    private RandomNumbers rand;
    private Creator creator;
    private int MAX_Y = 12, MAX_X = 10;
    private final int layers = 3;
    private double[] landscape_atributes = {0.2, 0.5};  //%air, %floor

    private boolean floor;
    private boolean waves;

    private int airY;


    public Ocean(int MAX_Y, int MAX_X, long seed) {
        rand = new RandomNumbers(seed);
        creator = new Creator(MAX_X, MAX_Y);
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
    }

    public void create() {
        landscape();    //determina el % de cielo, mar y si hay fondo marino o no
                
        for(int z = 0; z < layers; z++) {
            creator.createLandscape(floor, waves, airY);
        }

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {
                str.append( creator.getSymbolinPos(x, y) );
            }
        }
        return str.toString();
    }

    private void landscape() {
        if (landscape_atributes[1] > rand.randFreq()) {
            floor = true;
        }
        else {
            floor = false;
        }
        airY = (int) (rand.randFreq() * landscape_atributes[0] * MAX_Y);
    } 

    
    
    public int getMaxY() {
        return MAX_Y;
    }

    public int getMaxX() {
        return MAX_X;
    }
}
