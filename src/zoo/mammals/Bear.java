package zoo.mammals;

import zoo.Animal;
import zoo.IRunner;
import zoo.IWalker;

public class Bear extends Mammal implements IWalker, IRunner {
    public Bear(String name, int age) {
        super(name,age);

    }

    @Override
    public void move() {
        walk();

    }

    @Override
    public void walk() {
        System.out.println("медведь при ходьбе косолапит");

    }

    @Override
    public void run() {

    }
}
