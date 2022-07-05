package printer;

import java.io.OutputStream;
import java.io.PrintStream;

public class OceanPrinter {
    
    public static void print(String[][] ocean, OutputStream o) {
        PrintStream out = new PrintStream(o);
        for (String[] l1 : ocean) {
            for (String e : l1) {
                out.print(e);
            }
            out.print('\n');
        }
        out.print('\n');
    }
}
