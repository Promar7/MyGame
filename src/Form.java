/**
 * Created by Pro on 2016-02-22.
 */
public  class Form {
    private String name;
    private int hp;
    private int power;
    private int fire;
    private int cold;

    public Form() {
    }
    //to jest zmiana
    public Form(String name, int hp, int power, int cold, int fire){
        this.hp=hp;
        this.power=power;
        this.fire=fire;
        this.cold=cold;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getCold() {
        return cold;
    }

    public void setCold(int cold) {
        this.cold = cold;
    }

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                ", fire=" + fire +
                ", cold=" + cold +
                '}';
    }
}
