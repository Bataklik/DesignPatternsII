package domain;

public class FahrenheitThermometer implements IFahrenheitThermometer {

    private double temperature;

    public FahrenheitThermometer(double temp) {
        this.temperature = temp;
    }

    public double getFahrenheit() {
        return temperature;
    }

}