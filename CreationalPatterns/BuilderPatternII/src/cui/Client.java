package cui;

import domain.*;

public class Client {
    VoertuigDirector voertuigDirector;
    VoertuigBuilder autoBuilder;
    VoertuigBuilder vrachtwagenBuilder;

    public static void main(String[] args) {
        new Client().run();
    }

    private void maakSportAuto() {
        voertuigDirector
                .veranderBuilder(autoBuilder);
        Voertuig voertuig = voertuigDirector.MaakVoertuig(
                VoertuigModel.Sport,
                VoertuigKleur.Wit,
                VoertuigMerk.Audi,
                2008);
        System.out.println(voertuig);
    }

    private void maakStadAuto() {
        voertuigDirector.veranderBuilder(autoBuilder);
        Voertuig voertuig = voertuigDirector.MaakVoertuig(
                VoertuigModel.Stad,
                VoertuigKleur.Grijs,
                VoertuigMerk.Opel,
                2004);
        System.out.println(voertuig);
    }
    private void maakCargoVrachtwagen() {
        voertuigDirector
                .veranderBuilder(vrachtwagenBuilder);
        Voertuig voertuig = voertuigDirector.MaakVoertuig(
                VoertuigModel.Cargo,
                VoertuigKleur.Zwart,
                VoertuigMerk.Mercedes,
                2002);
        System.out.println(voertuig);
    }


    private void run() {
        autoBuilder = new AutoBuilder();
        vrachtwagenBuilder = new VrachtwagenBuilder();
        voertuigDirector = new VoertuigDirector(autoBuilder);
        maakSportAuto();
        maakStadAuto();
        maakCargoVrachtwagen();
    }
}

