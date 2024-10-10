package zoo.mammals;

import zoo.Animal;
import zoo.IDiver;
import zoo.IWalker;

public class Lynx extends Animal implements IWalker, IDiver {
    public Lynx(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();
        dive();


    }

    @Override
    public void walk() {
        System.out.println( "Рысь двигается грациозно");

    }

    @Override
    public void dive() {
        System.out.println( "Рыси неплохо ныряют");

    }
}
