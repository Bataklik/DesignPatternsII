package domain;

public class AsianAnimalFactory implements AnimalFactory {

	public Animal createLion() {
		return new AsianLion();
	}

	public Animal createMonkey() {
		return new AsianMonkey();
	}

	public Animal createElephant() {
		return new AsianElephant();
	}

}