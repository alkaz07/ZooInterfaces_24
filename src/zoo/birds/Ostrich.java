package zoo.birds;

import zoo.IWalker;

public class Ostrich extends Bird implements IWalker {
    public double height;

    public Ostrich(String name, int age, double wingsSize, double height) {
        super(name, age, wingsSize);
        this.height = height;
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Я страус и только хожу");
    }
}
