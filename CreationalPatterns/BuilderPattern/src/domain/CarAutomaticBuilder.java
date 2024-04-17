package domain;

public class CarAutomaticBuilder implements Builder {
    private ICar car;

    public CarAutomaticBuilder() {
        car = new AutomaticCar();
    }


    @Override
    public void reset() {
        car = new AutomaticCar();
    }

    @Override
    public void setCarType(CarType type) {
        car.setType(type);
    }

    @Override
    public void setSeat(int seat) {
        car.setSeat(seat);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public ICar getCar() {
        return this.car;
    }
}
