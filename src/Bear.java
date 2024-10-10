public class Bear extends Animal implements IWalker{
    public Bear(String name, int age) {
        super(name,age);

    }

    @Override
    public void move() {
        walk();

    }

    @Override
    public void walk() {
        System.out.println("медведь при ходьбе косолапит");

    }
}
