import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        System.out.print(ocean.toString());
        out();
    }

    public static void out() {
        String file = "output.txt";
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(ocean.toString());
            bw.close();
            fw.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}