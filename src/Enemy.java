import java.util.Random;
import java.util.Scanner;

/**
 * Created by Pro on 2016-02-22.
 */
public class Enemy extends Form implements Fight{


    public Enemy(String name,int hp,int power,int fire,int cold){

        super(name,hp,power,fire,cold);
    }



    public static Enemy getEasyEnemy(){

        return new Enemy ("Diablo",1700,3,3,2);

    }

    public static Enemy getMediumEnemy(){

        return new Enemy("Belial",2500,5,5,4);
    }

    public static Enemy getHardEnemy(){

        return new Enemy("MORFEUS",3000,7,6,7);
    }

    public static Enemy getUltraEnemy(){

        return new Enemy("R@",3500,9,9,9);
    }
    public static Enemy getBoss(int wybor){

        if(wybor==1){ return new Enemy ("Diablo",1700,3,3,2);}
        if(wybor==2){ return new Enemy("Belial",2500,5,5,4);}
        if(wybor==3){ return new Enemy("MORFEUS",3000,7,6,7); }
        if(wybor==4){ return new Enemy("R@",3500,9,9,9);}
        return null;
    }


    @Override
    public void fight(Form form) {
            form.setHp(getHp()- new Random().nextInt(form.getPower())*form.getFire() *10);
        }
    }

