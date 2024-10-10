package zoo.mammals;

import zoo.Animal;
import zoo.IDiver;
import zoo.IRunner;
import zoo.IWalker;

public class Lynx extends Mammal implements IWalker, IDiver, IRunner {
    public Lynx(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();
        dive();
        run();


    }

    @Override
    public void walk() {
        System.out.println( "Рысь двигается грациозно");

    }

    @Override
    public void dive() {
        System.out.println( "Рыси неплохо ныряют");

    }

    @Override
    public void run() {
        System.out.println( "Рыси очень быстро бегают");

    }
}
