public class Whale extends Animal implements IDiver {
    public int bodyLength;

    public Whale(String name, int age, int bodyLength) {
        super(name, age);
        this.bodyLength = bodyLength;
    }

    @Override
    public void move() {
        dive();
    }

    @Override
    public void dive() {
        System.out.println(name + " глубоко ныряет");
    }
}
