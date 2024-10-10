public class Woodpecker extends Bird implements IFlyer{
    public Woodpecker(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {

        fly();
    }

    @Override
    public void fly() {
        System.out.println("Лечу и думаю, где бы постучать...");
    }
}
