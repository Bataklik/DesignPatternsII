package domain;

public class Coffee extends Drink {

    public void brew() {
        System.out.println("Dripping Coffee through filter!");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk!");
    }
}