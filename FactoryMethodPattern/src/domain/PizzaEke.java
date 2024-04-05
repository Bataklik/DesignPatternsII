package domain;

public class PizzaEke implements Pizza {

    private String name;

    public PizzaEke() {
        this.name = "Pizza Eke";
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }
}