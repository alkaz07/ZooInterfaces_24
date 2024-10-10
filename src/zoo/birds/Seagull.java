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

    @Override
    public void takeoff(String from) {
        System.out.println("чайка взлетает с поверхности моря "+from);

    }

    @Override
    public void land(String to) {
        System.out.println("чайка садится на скалы "+to);

    }
}
