package domain;

public class ManualCar implements ICar {
    CarType type;
    private int seat;
    private Engine engine;

    public void setType(CarType type) {
        this.type = type;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "ManualCar{" +
                "carType=" + type +
                ", seat=" + seat +
                ", engine=" + engine +
                '}';
    }
}