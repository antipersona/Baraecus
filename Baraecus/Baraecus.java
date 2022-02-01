import ocean.Ocean;

public class Baraecus {

    private static Ocean ocean;
    private static long seed;
    public static void main(String[] args) {
        seed = System.currentTimeMillis() % 1000;
        int x = 50;
        int y = 16;
        ocean = new Ocean(x, y, seed);
        ocean.create();
        System.out.println(ocean.toString());
    }

}