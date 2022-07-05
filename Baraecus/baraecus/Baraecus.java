package baraecus;
/*
 * Its function is to create the ocean using OceanObjects
 */
public class Baraecus {
 
    private static int sizeX = 50;
    private static int sizeY = 50;

    public static void setSizeX(int sizeX) {
        Baraecus.sizeX = sizeX;
    }

    public static void setSizeY(int sizeY) {
        Baraecus.sizeY = sizeY;
    }

    public static int getSizeX() {
        return sizeX;
    }

    public static int getSizeY() {
        return sizeY;
    }

    public static void start() {
        System.out.println("\uD83D\uDE80");
    }
}