package domain;

public class AutomaticCar implements ICar {
    private CarType type;
    private int seat;
    private Engine engine;

    @Override
    public void setType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "AutomaticCar{" +
                "type=" + type +
                ", seat=" + seat +
                ", engine=" + engine +
                '}';
    }
}
