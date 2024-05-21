package cli;

import domain.Coffee;
import domain.Drink;
import domain.Tea;

public class Client {

	public static void main(String[] arg) {
		Drink Coffee = new Coffee();
		Drink Tea = new Tea();

		Coffee.prepareDrink();
		System.out.println("---");
		Tea.prepareDrink();
	}
}