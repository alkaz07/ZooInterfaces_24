package zoo.reptiles;
import zoo.ICrawler;



public class Snake extends Reptile implements ICrawler {
    public Snake(String name, int age, double tailLength) {
        super(name, age, tailLength);
    }

    @Override
    public void move() {
        System.out.println(name + "Ссссс я уже близко " );

    }


    public void crawl() {
        System.out.println(name + "Ходить я не умею, но зато как ползаю ");
    }
}
