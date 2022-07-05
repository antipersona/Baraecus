import java.io.PrintStream;
import java.util.Scanner;

import baraecus.Baraecus;

public class Main {
    private static final String TITLE = "BARAECUS";
    private static final String SUBTITLE = "--God of the sea--";
    private static final String[] OPTIONS = {
            "[o] Change output file (by default it is the terminal)",
            "[s] Change ocean size",
            "[d] Restore everything",

            "[e] Exit",
            "or press [intro] to start..."
    };

    private static final int DEFX = 50, DEFY = 50;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String out = "default";
        int x = DEFX, y = DEFY;

        System.out.println("  " + TITLE);
        // System.out.println(SUBTITLE);
        Boolean b = false;

        while (!b) {
            System.out.println("[MENU]");
            switch (menu(in)) {
                case "o": // change output file
                    // TODO se actualizaria el Printstream out
                    break;
                case "s": // change display size (ocean size)
                    // TODO
                    break;
                case "e": // exit

                    break;
                case "d": // default
                    out = "default";
                    x = DEFX;
                    y = DEFY;
                    break;
                case "": // start
                    String[] _args = { "-x" + x, "-y" + y, "-o" + out };
                    Baraecus.main(_args);
                    break;
                default:
                    System.out.println("ERROR: bad input");
            }
        }
    }

    private static String menu(Scanner in) {
        for (String o : OPTIONS) {
            System.out.println(o);
        }
        return in.nextLine();
    }

}