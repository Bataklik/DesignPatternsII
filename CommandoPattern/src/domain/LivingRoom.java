package domain;

//* Invoker klasse met een IRoom interface
public class LivingRoom implements IRoom {
    ILight light;
    IWindow window;
    public LivingRoom(ILight light,IWindow window) {
        this.light = light;
        this.window = window;
    }

    @Override
    public void executeLightCommand(ICommand lightCommand) {
        lightCommand.execute();
    }

    @Override
    public void executeWindowCommand(ICommand windowCommand) {
        windowCommand.execute();
    }

    @Override
    public boolean isLightOn() {
        return light.isOn();
    }

    @Override
    public boolean isWindowOpen() {
        return window.isOpen();
    }
}
