import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        example1();
        //example2WithDucks();
        example12();
    }

    private static void example12() {
        Duck duck = new Duck("Кряк", 1, 1);
        Eagle eagle1 = new Eagle("Орлан", 10, 120);
        Ostrich straus = new Ostrich("Дылда с маоенькой головой", 10, 90, 250);
        Bird[] birds = {duck, eagle1, straus };
        for (Bird b: birds) if(b instanceof IWalker) System.out.println(b);

    }

    private static void example2WithDucks() {
        Duck donald = new Duck("Дональд",6,50);
        Duck zigzag = new Duck("Зигзаг МакКряк", 7, 70);
        Sokol sokol = new Sokol("Сокол", 2, 30);
        Eagle orel = new Eagle("Орел-1", 7, 200);
        Penguin skiper = new Penguin("Шкипер", 4, 50);
        Seagull skattl = new Seagull("Скаттл",5,50);
        Animal[] animals = {donald, zigzag, orel, skiper, sokol,skattl};



        IFlyer[] flyers = {donald, zigzag, orel,skattl};
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
        Bear mishka = new Bear("Мишка", 10);
        Seagull skattl = new Seagull("Скаттл", 5,50);


        Animal[] animals = {gena, gorgo, lolo, sokol, sobaka, mishka,skattl};
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