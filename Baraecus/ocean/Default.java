package ocean;

public abstract class Default implements Groups {

    protected int x, y;
    protected String symbol;
    protected String name;
    protected int[] altitude; //[0] = min and [1] = max
    protected boolean used;
    protected boolean on = true;
    protected Ocean ocean;
    protected final int max_q = 12;

    public Default(int x, int y, Ocean ocean) {
        this.x = x;
        this.y = y;
        this.ocean = ocean;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getProbabilityX(int grow_cycle) {
        return 0;
    }

    @Override
    public double getProbabilityY(int grow_cycle) {
        return 0;
    }

    public void turnOff() {
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void addX() {
        x++;
    }

    public void addY() {
        y++;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getChar() {
        String s = "";
        s += name.toCharArray()[0];
        return s;
    }

}