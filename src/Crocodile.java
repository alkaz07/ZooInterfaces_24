public class Crocodile extends Reptile implements IDiver{
    public Crocodile(String name, int age, double tailLength) {
        super(name, age, tailLength);
    }

    @Override
    public void move() {
        dive();
    }

    public void dive(){
        System.out.println("крокодил кое-как ныряет");
    }
}
