package domain;

public class CarManualBuilder implements Builder {

    private ICar car;

    public CarManualBuilder() {
        car = new ManualCar();
    }

    public void reset() {
       car = new ManualCar();
    }

    public void setCarType(CarType type) {
        car.setType(type);
    }


    public void setSeat(int seat) {
        car.setSeat(seat);
    }

    /**
     * @param engine
     */
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    public ICar getCar() {
        return this.car;
    }

}