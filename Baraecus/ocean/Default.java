package ocean;

public abstract class Default implements Groups {

    protected int x, y;
    protected int quantity;
    protected String symbol;
    protected String name;
    protected int[] altitude; //[0] = min and [1] = max
    protected boolean used;

    public Default(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getProbabilityX(int quantity, int max_q) {
        return 0;
    }

    @Override
    public double getProbabilityY(int quantity, int max_q) {
        return 0;
    }
}