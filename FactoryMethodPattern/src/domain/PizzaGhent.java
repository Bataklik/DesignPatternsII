package domain;

public class PizzaGhent implements Pizza {
    private String name;

    public PizzaGhent() {
        this.name = "Pizza Ghent";
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