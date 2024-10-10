public class Kaban extends Animal implements IWalker {
    public Kaban(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {walk();

    }

    @Override
    public void walk() {
        System.out.println(this+"Кабан роется в желудях и похрюкивает");
    }
}
