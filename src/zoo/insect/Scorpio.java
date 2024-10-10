package zoo.insect;

import zoo.IRunner;

public class Scorpio extends Insect implements IRunner {
    public Scorpio(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        run();
    }

    @Override
    public void run() {
        System.out.println("Скорпион быстро бегает");
    }
}
