import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {

    
    private static final String TITLE = "BARAECUS";
    private static final String SUBTITLE = "--God of the sea--";
    private static final String[] OPTIONS = {
        "[o] Change output file (by default it is the terminal)",
        "or press [intro] to start..."
    };

    public static void main(String[] args) {
        System.out.println(TITLE);
        System.out.println(SUBTITLE);
        menu();
    }

    private static void menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Select one:");
        for (String o : OPTIONS) {
            System.out.println(o);
        }
        switch(in.nextLine()) {
            case "o":
                //TODO
                break;
            default:
                //TODO
        }
    }

}