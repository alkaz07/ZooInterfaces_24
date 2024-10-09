public abstract class Reptile extends Animal{
    double tailLength;

    public Reptile(String name, int age, double tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }
}
