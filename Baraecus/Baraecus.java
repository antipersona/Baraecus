import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import ocean.Ocean;
import ocean.random.RandomNumbers;

public class Baraecus {

    private static Ocean ocean;
    private static long seed;
    public static void main(String[] args) {
        seed = System.currentTimeMillis() % 1000;
        new RandomNumbers(seed);
        int x = 25;
        int y = 16;
        ocean = new Ocean(x, y, seed);
        ocean.create();
        System.out.print(ocean.toChars());
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