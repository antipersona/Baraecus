package objects;

public class Creature implements OceanObject {

    private int x;
    private int y;
    private String emoji;

    public Creature(int x, int y, String emoji) {
        this.x = x;
        this.y = y;
        this.emoji = emoji;
    }

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

}
