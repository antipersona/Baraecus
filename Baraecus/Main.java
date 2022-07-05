import java.util.Scanner;

import baraecus.Baraecus;

public class Main {
    private static final String TITLE = "BARAECUS";
    private static final String SUBTITLE = "--God of the sea--";
    private static final String[] OPTIONS = {
            "[o] Change output file (by default it is the terminal)",
            "[s] Change ocean size",

            "[e] Exit",
            "or press [intro] to start..."
    };

    public static void main(String[] args) {
        System.out.println("  " + TITLE);
        System.out.println(SUBTITLE);
        Boolean b;
        do {
            System.out.print("\n");
            b = menu();
        } while (!b);

    }

    private static Boolean menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Select one:");
        for (String o : OPTIONS) {
            System.out.println(o);
        }
        switch (in.nextLine()) {
            case "o": // change output file
                // TODO
                break;
            case "s": // change display size (ocean size)
                // TODO
                break;

            case "e": // exit
                return true;
            case "": // start
                Baraecus.start();
                break;
            default:
                System.out.println("ERROR: bad input");
                return false;
        }
        return false;
    }

}