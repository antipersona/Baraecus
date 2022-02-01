import ocean.Ocean;

public class Baraecus {

    private static Ocean ocean;
    public static void main(String[] args) {
        int x = 8;
        int y = 16;
        ocean = new Ocean(x, y);
        System.out.println(ocean.create());
    }

}