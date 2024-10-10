package zoo.mammals;

import zoo.IRunner;

public class Deer extends Mammal implements IRunner {
    public Deer(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        run();
    }

    @Override
    public void run() {
        System.out.println("Олень и бегает и ходит");
    }
}
