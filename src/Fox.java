public class Fox extends Animal implements IWalker{
    public double lengthFoxTail;
    public Fox(String name, int age, double lengthFoxTail) {
        super(name, age);
        this.lengthFoxTail = lengthFoxTail;
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Я лиса, петляю по дороге");
    }
}
