package domain;


public class Director {

    public Director() {
    }

    public ICar constructCar(Builder carBuilder) {
        carBuilder.setEngine(new Engine());
        carBuilder.setSeat(4);
        carBuilder.setCarType(CarType.CITY_CAR);
        return carBuilder.getCar();
    }
    public ICar constructSUV(Builder carBuilder) {
        carBuilder.setEngine(new Engine());
        carBuilder.setSeat(4);
        carBuilder.setCarType(CarType.SUV);
        return carBuilder.getCar();
    }

    public ICar constructSportCar(Builder carBuilder) {
        carBuilder.setEngine(new Engine());
        carBuilder.setSeat(4);
        carBuilder.setCarType(CarType.SPORT_CAR);
        return carBuilder.getCar();
    }

}