import java.util.Scanner;

/**
 * Created by Pro on 2016-02-25.
 */
public class UserProvider {
    public static User getFromConsole() {
        User user = new User();

        Scanner in = new Scanner(System.in);
        String name;
        int skillPoints = 30;
        int hp = 2000;
        System.out.print("Name your hero:");
        name = in.nextLine();
        System.out.println("HP:");
        System.out.println("1. 2000");
        System.out.println("2. 2500");
        System.out.println("3. 3000");
        int choose = in.nextInt();

        if (choose == 1) {
            user.setHp(2000);
        }
        if (choose == 2) {
            user.setHp(2500);
        }
        if (choose == 3) {
            user.setHp(3000);
        }
        skillPoints -= (3 * choose);
        System.out.print("Your point " + skillPoints + "  ");
        System.out.print("Power(1-10): ");
         choose = in.nextInt();
        user.setPower(choose);
        skillPoints-=choose;
        System.out.print("Your point " + skillPoints + "  ");
        System.out.print("Fire(1-10): ");
        choose = in.nextInt();
        user.setFire(choose);
        skillPoints-=choose;
        System.out.print("Your point " + skillPoints + "  ");
        System.out.print("Cold(1-10): ");
        choose = in.nextInt();
        user.setCold(choose);
        System.out.println("__________________________");
        //;
        System.out.println("__________________________");

    return user;
    }
}
