public class Duck extends Bird implements IFlyer, IDiver, IWalker{
    public Duck(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        System.out.println("Утке трудно выбрать что делать");

    }

    @Override
    public void dive() {
        System.out.println("утка ныряет неглубоко");
    }

    @Override
    public void fly() {
        System.out.println("утка летит со свистом");
    }

    @Override
    public void walk() {
        System.out.println("Утка ходит по-утиному");
    }
}
