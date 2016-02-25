/**
 * Created by Pro on 2016-02-25.
 */
public class Game {
    private final int level ;
    private User user;
    private Enemy enemy;

    public Game(int level) {
        this.level = level;
    }
    public GameArena intialize(){
        return new GameArena(user,enemy);

    }

    public int getLevel() {
        return level;
    }

    public User getUser() {
        return user;
    }

    public Game setUser(User user) {
        this.user = user;
        return this;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public Game setEnemy(Enemy enemy) {
        this.enemy = enemy;
        return this;
    }

}
