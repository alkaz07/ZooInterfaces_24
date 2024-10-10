package zoo.mammals;

import zoo.Animal;
import zoo.IRunner;
import zoo.IWalker;

public class Dog extends Mammal implements IRunner {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {run();
    }


    @Override
    public void run() {
        System.out.println("собака бегает по собачьи");

    }
}
