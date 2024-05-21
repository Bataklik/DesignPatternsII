package domain;

public class Tea extends Drink {

    public void brew() {
        System.out.println("Steeping the tea!");
    }

    public void addCondiments() {
        System.out.println("Adding lemon!");
    }
}