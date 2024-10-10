package zoo;

public interface IFlyer {
    void fly();
    void takeoff(String from);
    void land(String to);

    default void travelByAir(String from, String to){
        takeoff(from);
        fly();
        land(to);
    }
}
