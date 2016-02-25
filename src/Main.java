import java.util.Random;
import java.util.Scanner;

/**
 * Created by Pro on 2016-02-22.
 */
public class Main {
    public static void main(String[] args) {


        User user = UserProvider.getFromConsole();



        int change;

         System.out.println("LEVEL GAME:");
         System.out.println("1.EASY");
         System.out.println("2.MEDIUM");
         System.out.println("3.HARD");
         System.out.println("4.ULTRA");
        System.out.println("_____________________");
        int i = new Scanner(System.in).nextInt();
        Enemy enemy= Enemy.getBoss(i);


        GameArena gameArena = new Game(i).setUser(user).setEnemy(enemy).intialize();
        boolean success = gameArena.fight();

        if(success){
            System.out.println("HURA!");
        }else{
            System.out.println("OO BAMBOO");
        }


    }
}
