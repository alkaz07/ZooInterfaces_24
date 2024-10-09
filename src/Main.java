import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        example1();
        //example2WithDucks();
    }

    private static void example2WithDucks() {
        Duck donald = new Duck("Дональд",6,50);
        Duck zigzag = new Duck("Зигзаг МакКряк", 7, 70);
        Sokol sokol = new Sokol("Сокол", 2, 30);
        Eagle orel = new Eagle("Орел-1", 7, 200);
        Penguin skiper = new Penguin("Шкипер", 4, 50);
        Animal[] animals = {donald, zigzag, orel, skiper, sokol};



        IFlyer[] flyers = {donald, zigzag, orel};
        for (IFlyer f: flyers){
            System.out.println("f = "+f);
            f.fly();
        }

        IDiver[] divers = new IDiver[4];
        int i=0;
        for (Animal a : animals)
        {
            if(a instanceof IDiver) {
                divers[i] = (IDiver) a;
                i++;
            }
        }
        System.out.println("divers = " + Arrays.toString(divers));
    }

    private static void example1() {
        Crocodile gena = new Crocodile("Гена", 12, 230);
        Penguin lolo = new Penguin("Лоло", 1, 10);
        Eagle gorgo = new Eagle("Горго", 4, 150);
        Sokol sokol = new Sokol("Сокол", 2, 30);
        Dog sobaka = new Dog("пёс", 5);

        Animal[] animals = {gena, gorgo, lolo, sokol, sobaka};
        for (Animal a : animals)
            a.move();

        for (Animal a : animals){
            System.out.println(Arrays.toString(a.getClass().getMethods()));
            System.out.println(a.getClass());
        }

        for (Animal a : animals){
            if (a instanceof IFlyer){
                IFlyer f = (IFlyer) a;
                f.fly();
            }
            if (a instanceof IDiver)
                ((IDiver) a).dive();

        }
    }
}