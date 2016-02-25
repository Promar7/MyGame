import java.util.Random;

/**
 * Created by Pro on 2016-02-17.
 */
public class User extends Form implements Fight {

    public User() {
        super();
    }
    @Override
    public void fight(Form form) {
        form.setHp(getHp()- new Random().nextInt(form.getPower())*form.getFire() *10);
    }
}
