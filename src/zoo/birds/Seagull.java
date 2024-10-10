package zoo.birds;

import zoo.IFlyer;

public class Seagull extends Bird implements IFlyer {
    public Seagull(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println(this + "чайка летит над морем");
    }
}
