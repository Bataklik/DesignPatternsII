package domain;

public interface VoertuigBuilder {

	void MaakMerk(VoertuigMerk merk);

	void MaakModel(VoertuigModel model);

	void MaakJaarFabricage(int jaar);

	void MaakKleur(VoertuigKleur kleur);

	void resetten();

	Voertuig geefVoertuig();

}