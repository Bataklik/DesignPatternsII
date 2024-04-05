package domain;

public class SwitchLightCommand implements ICommand {
    // Receiver object
    private ILight light;

    public SwitchLightCommand(ILight ILight) {
        this.light = ILight;
    }

    @Override
    public void execute() {
        this.light.switchLight();
    }
}
