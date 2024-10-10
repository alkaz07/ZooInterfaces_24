package zoo;

public abstract class Animal {
    protected String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
