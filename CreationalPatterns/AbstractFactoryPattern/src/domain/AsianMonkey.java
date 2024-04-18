package domain;

public class AsianMonkey implements Animal {

	@Override
	public void feed() {
		System.out.println("Asian monkey is eating fruits and insects.");
	}

	@Override
	public void makeSound() {
		System.out.println("Asian monkey is making monkey sounds.");
	}

}