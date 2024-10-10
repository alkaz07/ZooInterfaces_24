import zoo.Animal;
import zoo.IDiver;
import zoo.IFlyer;
import zoo.IWalker;
import zoo.birds.*;
import zoo.mammals.Bear;
import zoo.mammals.Dog;
import zoo.mammals.Kaban;
import zoo.mammals.Koala;
import zoo.reptiles.Crocodile;



import zoo.birds.Bird;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // example1();
       // example2WithDucks();
       // example12();
        example1010();
    }

    private static void example1010() {
        Cuckoo cuckoo = new Cuckoo("Машка",2, 32);
      //  System.out.println(cuckoo.name);  //запрещено прямое обращение к полю name, потому что модификатор доступа protected и класс Animal находится в другом package
        cuckoo.fly();
    }

    //by Sergei 2024.10.10 с целью тренировки
    private static void example12() {
        Duck duck = new Duck("Кряк", 1, 1);
        Eagle eagle1 = new Eagle("Орлан", 10, 120);
        Ostrich straus = new Ostrich("Дылда с маоенькой головой", 10, 90, 250);
        Flamingo flamingo = new Flamingo("Фламинго",8,180,"Розовый");
        Bird[] birds = {duck, eagle1, straus, flamingo };
        for (Bird b: birds) if(b instanceof IWalker) System.out.println(b);

    }

    private static void example2WithDucks() {
        Duck donald = new Duck("Дональд",6,50);
        Duck zigzag = new Duck("Зигзаг МакКряк", 7, 70);
        Sokol sokol = new Sokol("Сокол", 2, 30);
        Eagle orel = new Eagle("Орел-1", 7, 200);
        Penguin skiper = new Penguin("Шкипер", 4, 50);
        //
        Seagull skattl = new Seagull("Скаттл",5,50);
        Flamingo flamingo = new Flamingo("Фламинго",8,180,"Розовый");
        //
        Animal[] animals = {donald, zigzag, orel, skiper, sokol,skattl,flamingo};



        IFlyer[] flyers = {donald, zigzag, orel,skattl,flamingo};
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
        Kaban pyatak = new Kaban("Пятак",5);
        Bear mishka = new Bear("Мишка", 10);
        Seagull skattl = new Seagull("Скаттл", 5,50);
        Koala koala = new Koala("Стив",9);
        Flamingo flamingo = new Flamingo("Фламинго",8,180,"Розовый");


        Animal[] animals = {gena, gorgo, lolo, sokol, sobaka, mishka,skattl,koala,flamingo};
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