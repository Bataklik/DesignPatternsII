package domain;

public class PasteCommand implements Command {

	public void execute() {
		System.out.println("Pasting...");
	}

	public void undo() {
		// TODO - implement PasteCommand.undo
		throw new UnsupportedOperationException();
	}

}