package zoo;

import zoo.reptiles.Reptile;

public class Insect extends Reptile {
    public Insect(String name, int age, double tailLength) {
        super(name, age, tailLength);
    }

    @Override
    public void move() {
        System.out.println();
    }
}
