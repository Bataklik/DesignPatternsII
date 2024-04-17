package domain;

public class AutoBuilder implements VoertuigBuilder {

    private Voertuig voertuig;

    public AutoBuilder() {
        this.voertuig = new Auto();
    }

    @Override
    public void MaakMerk(VoertuigMerk merk) {
        this.voertuig.stelMerk(merk);
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
        this.voertuig = new Auto();
    }

    public Voertuig geefVoertuig() {
        return voertuig;
    }

}