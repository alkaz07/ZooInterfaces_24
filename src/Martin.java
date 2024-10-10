public class Martin extends Bird implements IDiver, IFlyer{
    public Martin(String name, int age, double wingsSize) {
        super(name, age, wingsSize);
    }

    @Override
    public void move() {
        fly(); dive();

    }

    @Override
    public void dive() {
        System.out.println("Ласточки ныряют за рыбой");

    }

    @Override
    public void fly() {
        System.out.println("Ласточки очень маневренно летают");

    }


    }

