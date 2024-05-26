package domain;

public class ProxyBestand implements Bestand {

    private EchteBestand bestand;
    private Gebruiker gebruiker;
    private int vereisteToegangsniveau;

    public ProxyBestand(String bestandsNaam, Gebruiker gebruiker, int vereisteToegangsniveau) {
        this.bestand = new EchteBestand(bestandsNaam);
        this.gebruiker = gebruiker;
        this.vereisteToegangsniveau = vereisteToegangsniveau;
    }

    public void lees() {
        if (toegangsControle()) {
            System.out.println("Toegang geaccepteerd door " + gebruiker.getGebruikersnaam());
            bestand.lees();
        } else
            System.out.println("Toegang geweigerd voor gebruiker: " + gebruiker.getGebruikersnaam());
    }

    public boolean toegangsControle() {
        return gebruiker.getToegangsniveau() >= vereisteToegangsniveau;
    }

}