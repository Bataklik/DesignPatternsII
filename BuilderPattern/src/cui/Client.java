package cui;

import domain.*;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        CarManualBuilder builder = new CarManualBuilder();
        CarAutomaticBuilder builder2 = new CarAutomaticBuilder();

        ICar manualCar = director.constructSportCar(builder);
        System.out.println(manualCar);

        ICar automaticCar = director.constructSportCar(builder2);
        System.out.println(automaticCar);
    }

}