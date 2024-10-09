public class Eagle extends Bird implements IFlyer{
    public Eagle(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        fly();
    }

    public void fly(){
        System.out.println(this + " летит");
    }
}
