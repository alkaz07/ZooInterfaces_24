public class Dog extends Animal implements IWalker{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {walk();
    }

    @Override
    public void walk() {
        System.out.println("собака бегает по собачьи");

    }
}
