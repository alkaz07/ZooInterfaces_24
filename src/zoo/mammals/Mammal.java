package zoo.mammals;

import zoo.Animal;

public abstract class Mammal extends Animal {
    protected String name;
    int age;

    public Mammal(String name, int age) {
        super(name, age);

    }
    @Override
    public String toString() {
        return "zoo.Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public abstract void move();


}

