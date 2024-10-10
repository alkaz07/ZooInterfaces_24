package zoo.reptiles;

import zoo.IDiver;

public class GreyToad extends Reptile implements IDiver {
    public GreyToad(String name, int age, double tailLength) {
        super(name, age, tailLength);
    }

    @Override
    public void move() {

    }

    @Override
    public void dive() {

    }
}
