package domain;

public class GhentFactory implements IPizzaFactory {

    public Pizza createPizza() {
        return new PizzaGhent();
    }

}