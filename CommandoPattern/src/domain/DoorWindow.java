package domain;

//* Receiver object met een IWindow interface
public class DoorWindow implements IWindow {
    boolean isOpen;

    public DoorWindow() {
        isOpen = false;
    }

    @Override
    public void turnWindow() {
        isOpen = !isOpen;
        System.out.println("Window is " + (isOpen ? "open" : "closed"));
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }
}
