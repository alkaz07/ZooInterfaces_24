package zoo.birds;

import zoo.IDiver;
import zoo.IFlyer;
import zoo.IWalker;

public class Duck extends Bird implements IFlyer, IDiver, IWalker {
    public Duck(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        System.out.println("Утке трудно выбрать что делать");

    }

    @Override
    public void dive() {
        System.out.println("утка ныряет неглубоко");
    }

    @Override
    public void fly() {
        System.out.println("утка летит со свистом");
    }

    @Override
    public void takeoff(String from) {
        System.out.println("Утка взлетает с воды в "+from);
    }

    @Override
    public void land(String to) {
        System.out.println("Утка изящно приземляется в "+to);
    }

    @Override
    public void walk() {
        System.out.println("Утка ходит по-утиному");
    }
}
