package zoo.Fish;

import zoo.IDiver;

public class Shark extends Fish implements IDiver {
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {

    }

    @Override
    public void dive() {

    }
}
