package zoo.insect;

import zoo.IFlyer;

public  class Bumblebee extends Insect implements IFlyer {
    public Bumblebee(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(""

    }

    @Override
    public void fly() {

    }
}
