package domain;

public class CelsiusThermometer implements ICelsiusThermometer {

    private double temperature;


    public CelsiusThermometer(double temp) {
        this.temperature = temp;
    }

    public CelsiusThermometer() {
    }
    @Override
    public double getCelsius() {
        return temperature;
    }

}