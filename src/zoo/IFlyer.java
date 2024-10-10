package zoo;

public interface IFlyer {
    void fly();
    //alkaz07 2024.10.10 доработал интерфейс, задав методы взлет и посадка для реализации путешествия по воздуху
    void takeoff(String from);
    void land(String to);

    default void travelByAir(String from, String to){
        takeoff(from);
        fly();
        land(to);
    }
}
