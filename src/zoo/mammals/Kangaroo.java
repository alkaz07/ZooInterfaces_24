package zoo.mammals;

import zoo.Animal;
import zoo.IJumper;
import zoo.IWalker;

public class Kangaroo extends Animal implements IWalker, IJumper {

    public Kangaroo(String name, int age) {
        super(name, age);

    }

    @Override
    public void move() {
        System.out.println("Кенгуру могут ходить,но больше любят прыгать");
    }

    @Override
    public void jump() {
        System.out.println("Кенгуру прыгают на расстояние до 12 метров");
    }

    @Override
    public void walk() {
        System.out.println("Ходят когда ищут еду");
    }
}

