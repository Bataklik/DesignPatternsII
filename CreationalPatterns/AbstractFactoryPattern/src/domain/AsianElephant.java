package domain;

public class AsianElephant implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Asian elephant is trumpeting.");
	}

	@Override
	public void feed() {
		System.out.println("Asian elephant is eating leaves and grass.");
	}

}