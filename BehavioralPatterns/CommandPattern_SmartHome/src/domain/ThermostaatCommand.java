package domain;

public class ThermostaatCommand implements Command {

    private Apparaat apparaat;

    public void execute() {
        apparaat.setActie();
    }

    public ThermostaatCommand(Apparaat apparaat) {
        this.apparaat = apparaat;
    }
}