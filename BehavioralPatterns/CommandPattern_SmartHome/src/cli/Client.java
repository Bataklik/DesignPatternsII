package cli;

import domain.*;

public class Client {


    public static void main(String[] args) throws InterruptedException {
        Apparaat licht = new Licht();
        Apparaat deur = new Deurvergrendeling();
        Apparaat verwarming = new Thermostaat();

        System.out.println(licht);
        System.out.println(deur);
        System.out.println(verwarming);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(1, new LichtCommand(licht));
        remoteControl.setCommand(2, new VergrendelCommand(deur));
        remoteControl.setCommand(3, new ThermostaatCommand(verwarming));

        Thread.sleep(2000);

        for (int i = 1; i < 4; i++) {
            remoteControl.pressButton(i);
        }

        System.out.println(licht);
        System.out.println(deur);
        System.out.println(verwarming);

    }

}