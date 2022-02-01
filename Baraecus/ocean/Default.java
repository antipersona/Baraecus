package ocean;

public abstract class Default {

    protected int x, y;
    protected int quantity;
    protected char symbol;
    protected String name;
    protected int[] altitude; //[0] = min and [1] = max
    protected boolean used;

    public Default(int x, int y) {
        this.x = x;
        this.y = y;
    }
}