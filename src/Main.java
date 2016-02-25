import random.GameLevel;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Pro on 2016-02-22.
 */
public class Main {
    public static void main(String[] args) {


        User user = UserProvider.getFromConsole();
        GameLevel gameLevel=new GameLevel();
        Enemy enemy= Enemy.getBoss(gameLevel.setLevel());

        GameArena gameArena = new Game(gameLevel.setLevel()).setUser(user).setEnemy(enemy).intialize();
        boolean success = gameArena.fight();

        if(success){
            System.out.println("HURA!");
        }else{
            System.out.println("OO BAMBOO");
        }

//
    }
}
