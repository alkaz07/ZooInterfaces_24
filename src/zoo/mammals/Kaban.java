package zoo.mammals;

import zoo.Animal;
import zoo.IRunner;
import zoo.IWalker;


public class Kaban extends Mammal implements IWalker, IRunner {
    public Kaban(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();

    }

    @Override
    public void walk() {
        System.out.println(this + "Кабан роется в желудях и похрюкивает");
    }

    @Override
    public void run() {
        {
            System.out.println(this + "Кабан Василий несется по лесу с радостным хрюканьем ");
        }
    }
}
