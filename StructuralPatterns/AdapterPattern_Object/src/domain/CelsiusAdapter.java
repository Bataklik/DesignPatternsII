package domain;

public class CelsiusAdapter implements Client {

    private FahrenheitWeatherService adaptee;

    public double getTemperature() {
        return (adaptee.getTemperature() - 32) * 5 / 9;
    }


    public CelsiusAdapter(FahrenheitWeatherService fahrenheitWeatherService) {
        this.adaptee = fahrenheitWeatherService;
    }

}