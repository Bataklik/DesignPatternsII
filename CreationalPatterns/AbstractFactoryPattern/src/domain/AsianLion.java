package domain;

public class AsianLion implements Animal {

	@Override
	public void makeSound() {
		System.out.println("Asian lion is roaring.");
	}

	@Override
	public void feed() {
		System.out.println("Asian lion is eating meat.");
	}

}