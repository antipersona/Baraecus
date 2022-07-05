package objects;

public interface OceanObject {
    public String getEmoji();
    public int getX();
    public int getY();
    public default Boolean canSpawnAtPos(int x, int y) {
        return true;
    }
}
