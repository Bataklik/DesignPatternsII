package domain;

public class Auto implements Voertuig {
    private int fabricageJaar;
    private VoertuigModel model;
    private VoertuigKleur kleur;
    private VoertuigMerk merk;

    @Override
    public int geefFabricageJaar() {
        return fabricageJaar;
    }

    @Override
    public VoertuigModel geefModel() {
        return model;
    }

    @Override
    public VoertuigKleur geefAutoKleur() {
        return kleur;
    }

    @Override
    public VoertuigMerk geefAutoMerk() {
        return merk;
    }

    @Override
    public void stelModel(VoertuigModel model) {
        this.model = model;
    }

    @Override
    public void stelKleur(VoertuigKleur kleur) {
        this.kleur = kleur;
    }

    @Override
    public void stelMerk(VoertuigMerk merk) {
        this.merk = merk;
    }

    @Override
    public void stelFabricageJaar(int jaar) {
        this.fabricageJaar = jaar;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " informatie:\n" +
                "  Model: " + model + "\n" +
                "  Merk: " + merk + "\n" +
                "  Kleur: " + kleur + "\n" +
                "  Fabricagejaar: " + fabricageJaar + "\n";
    }
}
