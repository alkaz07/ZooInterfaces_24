package zoo.birds;

import zoo.IFlyer;

public class Sokol extends Bird implements IFlyer {
public Sokol (String name, int age, double wingsSize) {
    super(name, age, wingsSize);
}
    @Override
    public void move() {fly();
    }

    @Override
    public void fly() {
        System.out.println(this + " летит быстро");
    }

    @Override
    public void takeoff(String from) {
        System.out.println("Сокол взлетает с земли в "+from);
    }

    @Override
    public void land(String to) {
        System.out.println("Сокол приземляется на руку "+to);

    }

    @Override
    public void travelByAir(String from, String to) {
        IFlyer.super.travelByAir(from, to);
    }
}
