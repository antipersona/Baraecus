package ocean;

public class Ocean {     //se encarga de crear el oceano

    private int MAX_Y = 12, MAX_X = 10;
    private Default[][] matrix;
    private Display display;

    public Ocean(int MAX_Y, int MAX_X) {
        this.MAX_X = MAX_X;
        this.MAX_Y = MAX_Y;
        display = new Display(MAX_X, MAX_Y);
    }

    public Default getObjectinPos(int x, int y) {
        return matrix[x][y];
    }

    public String create() {
        
        return null;
   }
    
    public int getMaxY() {
        return MAX_Y;
    }

    public int getMaxX() {
        return MAX_X;
    }
}
