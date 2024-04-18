package domain;

public class AfricanElephant implements Animal {

    @Override
    public void feed() {
        System.out.println("African elephant is eating leaves and grass.");
    }

    @Override
    public void makeSound() {
        System.out.println("African elephant is trumpeting.");
    }
}
