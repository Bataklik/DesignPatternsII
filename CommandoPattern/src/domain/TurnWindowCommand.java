package domain;

//*  Concrete Command 1
public class TurnWindowCommand implements ICommand {
    //? Receiver object als een variabel
    private IWindow window;

    //? Constructor voor het initialiseren van de Receiver object.
    public TurnWindowCommand(IWindow window) {
        this.window = window;
    }

    //? De `execute()`-methode van de `ICommand`-interface uitvoeren.
    @Override
    public void execute() {
      window.turnWindow();
    }
}
