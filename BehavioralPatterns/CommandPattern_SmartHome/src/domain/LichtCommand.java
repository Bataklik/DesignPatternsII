package domain;

public class LichtCommand implements Command {
    private Apparaat apparaat;

    public void execute() {
        apparaat.setActie();
    }

    public LichtCommand(Apparaat apparaat) {
        this.apparaat = apparaat;
    }
}