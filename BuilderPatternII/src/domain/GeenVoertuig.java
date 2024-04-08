package domain;

public class GeenVoertuig implements  Voertuig{
    private VoertuigModel model;
    private VoertuigMerk merk;
    private VoertuigKleur kleur;
    private int jaar;

    public GeenVoertuig() {
        this.model = VoertuigModel.GeenModel;
        this.merk = VoertuigMerk.GeenMerk;
        this.kleur = VoertuigKleur.GeenKleur;
        this.jaar = 0;
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
    public int geefFabricageJaar() {
        return jaar;
    }

    @Override
    public void stelModel(VoertuigModel model) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void stelKleur(VoertuigKleur kleur) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void stelMerk(VoertuigMerk merk) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void stelFabricageJaar(int jaar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
