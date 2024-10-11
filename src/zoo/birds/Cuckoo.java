package zoo.birds;

import zoo.IFlyer;

public class Cuckoo extends Bird implements IFlyer {

    public Cuckoo(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println(name + " летает по чужим гнездам");
    }

    @Override
    public void takeoff(String from) {
        System.out.println("Взлетает с одного дерева");
    }

    @Override
    public void land(String to) {
        System.out.println("Приземляется на другое дерево");
    }
}
