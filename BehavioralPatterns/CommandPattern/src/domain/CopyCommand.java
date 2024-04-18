package domain;

public class CopyCommand implements Command {

	private String copiedText;
	private int copiedIndex;

	public CopyCommand(int index) {
		this.copiedText = "";
		this.copiedIndex = index;
	}

	public void execute() {
		System.out.println("Coping...");
	}

	public void undo() {
		// TODO - implement CopyCommand.undo
		throw new UnsupportedOperationException();
	}

	public String getCopiedText() {
		return copiedText;
	}

	public void setCopiedText(String copiedText) {
		this.copiedText = copiedText;
	}

	public int getCopiedIndex() {
		return copiedIndex;
	}
}