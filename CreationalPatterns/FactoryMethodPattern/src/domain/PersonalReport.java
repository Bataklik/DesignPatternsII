package domain;

public class PersonalReport implements Report {

    @Override
    public void generateReport() {
        System.out.println("Dit is het PersonalReport:");
        System.out.println("------------------------------");
        System.out.println("Aantal werknemers: 50");
        System.out.println("Aantal nieuwe werknemers: 5");
        System.out.println("Aantal vertrokken werknemers: 3");
        System.out.println("------------------------------");
    }

}