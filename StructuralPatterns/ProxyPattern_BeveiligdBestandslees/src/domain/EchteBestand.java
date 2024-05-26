package domain;

public class EchteBestand implements Bestand {

	private String bestandNaam;

	public EchteBestand(String bestandNaam) {
		this.bestandNaam = bestandNaam;
	}

	public void lees() {
		System.out.println("Lezen van bestand: " + bestandNaam);
	}

}