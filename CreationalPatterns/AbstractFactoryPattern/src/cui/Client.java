package cui;

import domain.AfricanAnimalFactory;
import domain.Animal;
import domain.AsianAnimalFactory;

import java.util.List;

public class Client {

    private AfricanAnimalFactory africanAnimalFactory;
    private AsianAnimalFactory asianAnimalFactory;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        africanAnimalFactory = new AfricanAnimalFactory();
        asianAnimalFactory = new AsianAnimalFactory();

        Animal animal1 = africanAnimalFactory.createLion();
        Animal animal2 = asianAnimalFactory.createLion();
        Animal animal3 = africanAnimalFactory.createElephant();
        Animal animal4 = asianAnimalFactory.createElephant();

        List<Animal> animals = List
                .of(animal1, animal2, animal3, animal4);

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}