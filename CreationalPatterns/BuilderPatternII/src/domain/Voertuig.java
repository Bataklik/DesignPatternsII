package domain;

public interface Voertuig {

	VoertuigModel geefModel();

	VoertuigKleur geefAutoKleur();

	VoertuigMerk geefAutoMerk();
	int geefFabricageJaar();


	void stelModel(VoertuigModel model);


	void stelKleur(VoertuigKleur kleur);


	void stelMerk(VoertuigMerk merk);


	void stelFabricageJaar(int jaar);

}