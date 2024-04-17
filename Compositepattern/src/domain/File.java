package domain;

public class File implements Component {

    private String name;
    private ComponentType type;

    public File(ComponentType type, String name) {
        this.type = type;
        this.name = name;
    }

    public void display() {
        System.out.println(this.type.toString() + " " + this.name);
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    public String getName() {
        return this.name;
    }

}