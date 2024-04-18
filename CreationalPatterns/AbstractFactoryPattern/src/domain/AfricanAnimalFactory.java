package domain;

public class AfricanAnimalFactory implements AnimalFactory {

    public Animal createLion() {
        return new AfricanLion();
    }

    public Animal createMonkey() {
        return new AfricanMonkey();
    }

    public Animal createElephant() {
        return new AfricanElephant();
    }

}