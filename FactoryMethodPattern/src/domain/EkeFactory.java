package domain;

public class EkeFactory implements IPizzaFactory {

	public Pizza createPizza() {
		return new PizzaEke();
	}

}