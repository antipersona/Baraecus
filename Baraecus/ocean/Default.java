package ocean;

public abstract class Default implements Groups {

    protected int x, y;
    protected int quantity;
    protected String symbol;
    protected String name;
    protected int[] altitude; //[0] = min and [1] = max
    protected boolean used;
    protected boolean on = true;
    protected Ocean ocean;

    public Default(int x, int y, Ocean ocean) {
        this.x = x;
        this.y = y;
        this.ocean = ocean;
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

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

}