package domain;

public class NoCommand implements ICommand {

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
