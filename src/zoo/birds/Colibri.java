package zoo.birds;

import zoo.IFlyer;

public class Colibri extends Bird implements IFlyer {
    public Colibri(String name, int age, double wingsSize) {
    super(name, age, wingsSize);
    }


    @Override
    public void move() {}



        public void fly(){

        System.out.println(this + " очень быстро летает с ветки на ветку ");
        }

    @Override
    public void takeoff(String from) {
        System.out.println("Колибри взлетает быстро и почти незаметно"+ from);
    }

    @Override
    public void land(String to) {
        System.out.println("Колибри садиться на ветку почти сразу же и очень плавно"+ to);
    }
}
//
//
