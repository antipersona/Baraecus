package ocean;

import ocean.random.RandomNumbers;

public class Ocean {     //se encarga de crear el oceano

    private Creator creator;
    private int MAX_Y, MAX_X;
    private final int layers = 3;
    private double[] landscape_atributes = {0.3, 0.7, 0.6};  //%air, %floor %waves

    private boolean floor;
    private boolean waves;

    private int airY;


    public Ocean(int MAX_X, int MAX_Y, long seed) {
        creator = new Creator(MAX_X, MAX_Y, this);
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
    }

    public void create() {
        landscape_atributes();    //determina el % de cielo, mar y si hay fondo marino o no
                
        for(int z = 0; z < layers; z++) {
            creator.createLandscape(floor, waves, airY);
            creator.createDecoration(floor, airY);
        }

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int y = 0; y < MAX_Y; y++){
            for(int x = 0; x < MAX_X; x++)  {
                str.append(creator.getNameinPos(x, y));
                str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }
    
    public String toChars() {
        StringBuilder str = new StringBuilder();
        for (int y = 0; y < MAX_Y; y++){
            for(int x = 0; x < MAX_X; x++)  {
                str.append(creator.getSymbolinPos(x, y));
                str.append(" ");
            }
            str.append("\n");
        }
        return str.toString();
    }



    private void landscape_atributes() {
        floor = false;
        waves = false;
        RandomNumbers.randFreq();

        airY = (int) (RandomNumbers.randFreq() * landscape_atributes[0] * MAX_Y);

        if (landscape_atributes[1] > RandomNumbers.randFreq() + airY / MAX_Y) {
            floor = true;
        }

        if (landscape_atributes[2] > RandomNumbers.randFreq()) {
            waves = true;
        }
    }
    

    public boolean isUnderWater(int y) {
        if (floor) {
            return y < airY && y != getFloor();
        }
        else 
            return y < airY;
    }

    public boolean isAir(int y) {
        return y > airY;
    }
    
    public boolean isSurface(int y) {
        return airY == y;
    }

    public int getFloor() {
        return MAX_Y - 2;
    }
    
    public boolean isFloor(int y) {
        return floor && y == getFloor();
    }
    
    public int getMaxY() {
        return MAX_Y;
    }

    public int getMaxX() {
        return MAX_X;
    }
}
