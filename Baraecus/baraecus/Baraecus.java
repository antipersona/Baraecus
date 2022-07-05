package baraecus;

import com.vdurmont.emoji.EmojiParser;
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

    public static void main(String[] args) {    //TODO parse args
        String rocket = "\uD83D\uDE80";
        System.out.println(rocket);
        System.out.println(EmojiParser.parseToUnicode(":rocket:"));
    }
}