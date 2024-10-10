import zoo.Animal;
import zoo.IFlyer;

public class Insect extends Animal implements IFlyer {
    public Insect(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {

    }

    @Override
    public void fly() {


    }
}
