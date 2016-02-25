/**
 * Created by Pro on 2016-02-25.
 */
public class GameArena {
    private User user;
    private Enemy enemy;

    public GameArena(User user, Enemy enemy) {
        this.user = user;
        this.enemy = enemy;
    }



    public boolean fight(){
        while(!(user.getHp()<=0 || enemy.getHp()<=0)){

            System.out.println(enemy.getName()+" attacks you!");
            enemy.fight(user);
            System.out.println("Your hp: "+user.getHp());
            if(user.getHp()<=0){
                break;
            }
            System.out.println("Attack "+enemy.getName());
            user.fight(enemy);
            System.out.println("Enemy hp "+enemy.getHp());
            System.out.println("_______________________________");

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                //nic
            }
        }

        if(user.getHp()<=0){
            return false;
        }
        if(enemy.getHp()<=0){
            return true;
        }

        return false;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
