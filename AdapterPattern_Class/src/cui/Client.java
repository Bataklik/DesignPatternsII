package cui;

import domain.*;

public class Client {

    private ICelsiusThermometer thermo;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        ICelsiusThermometer celsiusThermoA = new CelsiusThermometer(7);
        IFahrenheitThermometer fahrenheitThermoB = new FahrenheitThermometer(14);

        ICelsiusThermometer celsiusThermoC;
        IFahrenheitThermometer fahrenheitThermoD;

        celsiusThermoC = new TemperatureAdapter(fahrenheitThermoB);
        fahrenheitThermoD = new TemperatureAdapter(celsiusThermoA);

        System.out.println("Temperatuur op meter A (in Celsius): " + celsiusThermoA.getCelsius() + " graden Celsius");
        System.out.println("Temperatuur op meter A (in Celsius) omgezet naar meter D (in Fahrenheit): " + fahrenheitThermoD.getFahrenheit() + " graden Fahrenheit");
        System.out.println();
        System.out.println("Temperatuur op meter B (in Fahrenheit): " + fahrenheitThermoB.getFahrenheit() + " graden Fahrenheit");
        System.out.println("Temperatuur op meter B (in Fahrenheit) omgezet naar meter C (in Celsius): " + celsiusThermoC.getCelsius() + " graden Celsius");
    }

}