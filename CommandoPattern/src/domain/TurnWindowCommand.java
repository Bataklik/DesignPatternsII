package domain;

public class TurnWindowCommand implements ICommand {
    IWindow window;

    public TurnWindowCommand(IWindow window) {
        this.window = window;
    }

    @Override
    public void execute() {
      window.turnWindow();
    }
}
