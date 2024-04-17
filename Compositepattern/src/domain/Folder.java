package domain;

import java.util.HashMap;
import java.util.Map;

public class Folder implements Component {

    private String name;
    private ComponentType type;
    private Map<String, Component> children;


    public Folder(String name) {
        this.name = name;
        this.type = ComponentType.FOLDER;
        this.children = new HashMap<>();
    }

    public void addComponent(Component component) {
        children.put(component.getName(), component);
    }

    public void removeComponent(String componentName) {
        children.remove(componentName);
    }

    public Component getComponent(String name) {
        return children.get(name);
    }

    public void display() {
        System.out.println(this.type.toString() + " " + this.name);
        for(Component component: children.values()) {
            component.display();
        }
    }

    @Override
    public ComponentType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }


}