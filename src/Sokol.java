public class Sokol extends Bird implements IFlyer{
public Sokol (String name, int age, double wingsSize) {
    super(name, age, wingsSize);
}
    @Override
    public void move() {fly();
    }

    @Override
    public void fly() {
        System.out.println(this + " летит быстро");
    }
}
