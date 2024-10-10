package zoo.mammals;

import zoo.Animal;
import zoo.IRunner;
import zoo.IWalker;

public class Wolf extends Mammal implements IWalker, IRunner {
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Бегу быстро, потому что кушать хочется.");

    }

    @Override
    public void run() {

    }
}
