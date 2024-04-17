package cui;

import domain.EkeFactory;
import domain.GhentFactory;
import domain.IPizzaFactory;
import domain.Pizza;

public class Client {
    public static void main(String[] args) {
        IPizzaFactory factory;
        factory = new GhentFactory();
        Pizza pizzaGhent = factory.createPizza();
        System.out.println(pizzaGhent);
        System.out.println("-------------------------------------------------");
        factory = new EkeFactory();
        Pizza pizzaEke = factory.createPizza();
        System.out.println(pizzaEke);
    }
}