package ocean;

import ocean.landscape.Air;
import ocean.landscape.Sand;
import ocean.landscape.Water;
import ocean.landscape.Wave;

public class Creator {

    private Default[][] matrix;

    int MAX_Y, MAX_X;

    public Creator(int MAX_Y, int MAX_X) {
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
    }

    public void createLandscape(boolean floor, boolean waves, int airY) {
        Default insert;
        for(int x = 0; x < MAX_X; x++) {
            for (int y = 0; y < MAX_Y; y++) {

                if (y < airY) {
                    insert = new Air(x, y);
                }
                else if(y == airY && waves) {
                    insert = new Wave(x, y);
                }
                else if(floor && y == MAX_Y - 1) {
                    insert = new Sand(x, y);
                }
                else {
                    insert = new Water(x, y);
                }
                
                matrix[x][y] = insert;
            }
        }
    }

    public Default getObjectinPos(int x, int y) {
        return matrix[x][y];
    }

    public char getSymbolinPos(int x, int y) {
        return matrix[x][y].symbol;
    }


}
