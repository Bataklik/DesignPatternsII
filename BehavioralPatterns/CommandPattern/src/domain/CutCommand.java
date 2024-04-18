package domain;

public class CutCommand implements Command {

	public void execute() {
		System.out.println("Cutting...");
	}

	public void undo() {
		// TODO - implement CutCommand.undo
		throw new UnsupportedOperationException();
	}

}