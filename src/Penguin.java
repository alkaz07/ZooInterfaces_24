public class Penguin extends Bird implements IDiver{

    public Penguin(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        dive();
    }

    public void dive(){
        System.out.println("пингвины круто ныряют");
    }
}
