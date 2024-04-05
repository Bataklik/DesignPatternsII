package domain;

public class BathRoom implements IRoom {
    private ILight light;
    private IWindow window;
    public BathRoom(ILight light) {
        this.light = light;
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
