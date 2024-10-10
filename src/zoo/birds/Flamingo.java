package zoo.birds;

import zoo.IFlyer;
import zoo.IWalker;

public class Flamingo extends Bird implements IFlyer, IWalker {
    public String color;

    public Flamingo(String name, int age, double wingsSize, String color) {
        super(name, age, wingsSize);
        this.color = color;

    }

    @Override
    public void move() {

        walk();
    }

    @Override
    public void fly() {
        System.out.println("Фламинго летит далеко");
    }

    @Override
    public void takeoff(String from) {
        System.out.println(color + " " +name+ " Взлетает с поверхности мелководного водоема");
    }

    @Override
    public void land(String to) {
        System.out.println(color + " " +name+ " Приземлился и чистит перышки");

    }

    @Override
    public void walk() {

        System.out.println("Я " + color +" "+ name + " могу стоять на одной ноге");

    }
}

