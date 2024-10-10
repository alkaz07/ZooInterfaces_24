public class Colibri extends Bird implements IFlyer{
    public Colibri(String name, int age, double wingsSize) {
    super(name, age, wingsSize);
    }


    @Override
    public void move() {}



        public void fly(){

        System.out.println(this + " очень быстро летает с ветки на ветку ");
        }
    }
//
//
