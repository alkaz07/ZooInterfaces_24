package zoo.birds;

import zoo.IDiver;
import zoo.IFlyer;

public class Hawk extends Bird implements IDiver, IFlyer {
    public Hawk(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        dive();
        fly();
    }

    @Override
    public void dive() {
        System.out.println("Ястреб не пингвин,но всё же ныряет)");
    }

    @Override
    public void fly() {
        System.out.println("Ястреб строит гнёзда на высоте до 20 метров от земли");
    }

    @Override
    public void takeoff(String from) {

    }

    @Override
    public void land(String to) {

    }
}

