package domain;

public class TemperatureAdapter implements ICelsiusThermometer, IFahrenheitThermometer {

    private IFahrenheitThermometer fahrenheitThermo;
    private ICelsiusThermometer celsiusThermo;

    public TemperatureAdapter(IFahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermo = fahrenheitThermometer;
    }

    public TemperatureAdapter(ICelsiusThermometer celsiusThermometer) {
        this.celsiusThermo = celsiusThermometer;
    }

    @Override
    public double getCelsius() {
        if (fahrenheitThermo == null) {
            throw new UnsupportedOperationException();
        }
        return (fahrenheitThermo.getFahrenheit() - 32) * 5 / 9;
    }


    public double getFahrenheit() {
        if (celsiusThermo == null) {
            throw new UnsupportedOperationException();
        }
        return celsiusThermo.getCelsius() * 9 / 5 + 32;
    }
}