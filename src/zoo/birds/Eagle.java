package zoo.birds;

import zoo.IFlyer;

public class Eagle extends Bird implements IFlyer {
    public Eagle(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println(this + " летит");
    }

    @Override
    public void takeoff(String from) {
        System.out.println("стремительно взлетает");
    }

    @Override
    public void land(String to) {
        System.out.println("Орел поднимает тучу пыли при посадке");
    }
}
