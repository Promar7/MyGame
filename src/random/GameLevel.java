package random;

import java.util.Scanner;

/**
 * Created by Pro on 2016-02-25.
 */
public class GameLevel {


    public int setLevel() {
        System.out.println("LEVEL GAME:");
        System.out.println("1.EASY");
        System.out.println("2.MEDIUM");
        System.out.println("3.HARD");
        System.out.println("4.ULTRA");
        System.out.println("_____________________");
        int i = new Scanner(System.in).nextInt();
        return i;
    }
}
