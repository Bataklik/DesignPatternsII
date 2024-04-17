package cui;

import domain.CelsiusAdapter;
import domain.Client;
import domain.FahrenheitWeatherService;

public class Main {

    private Client client;

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        client = new CelsiusAdapter(new FahrenheitWeatherService());
        System.out.println("Temperature from F° to C°: " + client.getTemperature());
    }

}