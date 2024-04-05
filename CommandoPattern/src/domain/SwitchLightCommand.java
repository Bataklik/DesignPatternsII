package domain;

//*  Concrete Command 1
public class SwitchLightCommand implements ICommand {
    //? Receiver object als een variabel
    private ILight light;

    //? Constructor voor het initialiseren van de Receiver object.
    public SwitchLightCommand(ILight ILight) {
        this.light = ILight;
    }

    //? De `execute()`-methode van de `ICommand`-interface uitvoeren.
    @Override
    public void execute() {
        this.light.switchLight();
    }
}
