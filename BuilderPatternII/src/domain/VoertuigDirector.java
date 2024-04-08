package domain;

public class VoertuigDirector {

    private VoertuigBuilder builder;

    public VoertuigDirector(VoertuigBuilder builder) {
        this.builder = builder;
    }

    public Voertuig MaakVoertuig(VoertuigModel model, VoertuigKleur kleur,
                                 VoertuigMerk merk,
                                 int jaar) {
        switch (model) {
            case Sport -> {
                return MaakSportVoertuig(kleur, model, merk, jaar);
            }
            case Cargo -> {
                return MaakCargoVoertuig(kleur, model, merk, jaar);
            }
            case Stad -> {
                return MaakStadVoertuig(kleur, model, merk, jaar);
            }
            default -> {
                return MaakGeenVoertuig();
            }
        }
    }

    private Voertuig MaakStadVoertuig(VoertuigKleur kleur, VoertuigModel model, VoertuigMerk merk, int jaar) {
        builder.resetten();
        builder.MaakModel(model);
        builder.MaakKleur(kleur);
        builder.MaakMerk(merk);
        builder.MaakJaarFabricage(jaar);
        return builder.geefVoertuig();
    }

    private Voertuig MaakCargoVoertuig(VoertuigKleur kleur, VoertuigModel model, VoertuigMerk merk, int jaar) {
        builder.resetten();
        builder.MaakKleur(kleur);
        builder.MaakModel(model);
        builder.MaakMerk(merk);
        builder.MaakJaarFabricage(jaar);
        return builder.geefVoertuig();
    }


    private Voertuig MaakSportVoertuig(
            VoertuigKleur kleur,
            VoertuigModel model,
            VoertuigMerk merk,
            int jaar) {
        builder.resetten();
        builder.MaakModel(model);
        builder.MaakKleur(kleur);
        builder.MaakMerk(merk);
        builder.MaakJaarFabricage(jaar);
        return builder.geefVoertuig();
    }

    private Voertuig MaakGeenVoertuig() {
        return new GeenVoertuig();
    }

    public void veranderBuilder(VoertuigBuilder builder) {
        this.builder.resetten();
        this.builder = builder;
        this.builder.resetten();

    }


}