package domain;

public class Gebruiker {

	private int toegangsniveau;
	private String gebruikersnaam;

	public Gebruiker(String gebruikersnaam, int toegangsniveau) {
		this.gebruikersnaam = gebruikersnaam;
		this.toegangsniveau = toegangsniveau;
	}

	public int getToegangsniveau() {
		return toegangsniveau;
	}

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}
}