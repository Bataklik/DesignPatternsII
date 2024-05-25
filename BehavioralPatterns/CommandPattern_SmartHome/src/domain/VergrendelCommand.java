package domain;

public class VergrendelCommand implements Command {

	private Apparaat apparaat;

	public void execute() {
		apparaat.setActie();
	}

	public VergrendelCommand(Apparaat apparaat) {
		this.apparaat = apparaat;
	}

}