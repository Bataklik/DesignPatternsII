package domain;

public class VrachtwagenBuilder implements VoertuigBuilder {

    private Voertuig voertuig;

    public VrachtwagenBuilder() {
        this.voertuig = new Vrachtwagen();
    }

    @Override
    public void MaakMerk(VoertuigMerk merk) {
        this.voertuig
                .stelMerk(merk);
    }

    @Override
    public void MaakModel(VoertuigModel model) {
        this.voertuig
                .stelModel(model);
    }

    @Override
    public void MaakJaarFabricage(int jaar) {
        this.voertuig
                .stelFabricageJaar(jaar);
    }

    @Override
    public void MaakKleur(VoertuigKleur kleur) {
        this.voertuig
                .stelKleur(kleur);
    }

    @Override
    public void resetten() {
        this.voertuig = new Vrachtwagen();
    }

    @Override
    public Voertuig geefVoertuig() {
        return voertuig;
    }
}