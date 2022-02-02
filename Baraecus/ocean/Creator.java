package ocean;

import ocean.decoration.Alga;
import ocean.decoration.Hardware;
import ocean.decoration.Kelp;
import ocean.landscape.Air;
import ocean.landscape.Sand;
import ocean.landscape.Water;
import ocean.landscape.Wave;
import ocean.random.RandomNumbers;

public class Creator {

    private int NUMBER_OF_DECORATIONS = 3;

    private Default[][] matrix;

    private int MAX_Y, MAX_X;
    private Ocean ocean;

    public Creator(int MAX_X, int MAX_Y, Ocean ocean) {
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
        this.ocean = ocean;
        matrix = new Default[MAX_X][MAX_Y];

    }

    public void createLandscape(boolean floor, boolean waves, int airY) {
        Default insert;

        for (int y = 0; y < MAX_Y; y++) {
            for (int x = 0; x < MAX_X; x++) {

                if (y < airY) {
                    insert = new Air(x, y, ocean);
                } else if (y == airY && waves) {
                    insert = new Wave(x, y, ocean);
                } else if (floor && y == MAX_Y - 1) {
                    insert = new Sand(x, y, ocean);
                } else {
                    insert = new Water(x, y, ocean);
                }

                matrix[x][y] = insert;
            }
        }
    }

    public void createDecoration(boolean floor, int airY) {

        int sum = 0, all = MAX_X * MAX_Y;
        int cycle = 0;
        while (all > sum) {
            sum = 0;
 
            for (int y = 0; y < MAX_Y; y++) {
                for (int x = 0; x < MAX_X; x++) {

                    if (cycle == 0 && y == ocean.getFloor()) {
                        switch (RandomNumbers.randInt( 2 * (NUMBER_OF_DECORATIONS - 1))) {
                            case 0:
                                if (floor)
                                    matrix[x][y] = new Alga(x, y, ocean);

                                break;
                            case 1:
                                if (floor)
                                    matrix[x][y] = new Hardware(x, y, ocean);

                                break;
                            case 3:
                                if ( x != 0 && !matrix[x - 1][y].isOn())
                                    matrix[x][y] = new Kelp(x, y, ocean);

                                break;
                        }
                    }

                    if (matrix[x][y].isOn()) {
                        if (grow(x, y, cycle)) {
                            sum--;
                        }
                        matrix[x][y].turnOff();
                    } else {
                        sum++;
                    }
                }
            }
            cycle++;
        }
    }

    private Boolean grow(int x, int y, int cycle) {
        Boolean ret = false;
        if( matrix[x][y].getProbabilityY(cycle) > RandomNumbers.randFreq()) {
            matrix[x][y - 1] = matrix[x][y];
            matrix[x][y+1].addY();
            ret = true;
        }
        if( matrix[x][y].getProbabilityX(cycle) > RandomNumbers.randFreq()) {
            matrix[x + 1][y] = matrix[x][y];
            matrix[x + 1][y].addX();
            ret = true;
        }
        return ret;
    }

    public Default getObjectinPos(int x, int y) {
        return matrix[x][y];
    }

    public String getNameinPos(int x, int y) {
        return matrix[x][y].getName();
    }

}
