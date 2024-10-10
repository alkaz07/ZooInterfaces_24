public class Koala extends Animal implements IWalker{
    public Koala(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Я Коала " + name + ", мало хожу, много сплю и ем");

    }
}
