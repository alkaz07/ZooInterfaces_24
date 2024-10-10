public class Wolf extends Animal implements IWalker {
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Бегу быстро, потому что кушать хочется.");

    }
}
