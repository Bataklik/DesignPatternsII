package domain;

public class AfricanLion implements Animal {

	@Override
	public void feed() {
		System.out.println("African lion is eating meat.");
	}

	@Override
	public void makeSound() {
		System.out.println("African lion is roaring.");
	}

}