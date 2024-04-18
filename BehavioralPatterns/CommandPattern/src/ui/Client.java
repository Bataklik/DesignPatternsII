package ui;

import domain.*;

public class Client {

	private TextEditor nodepad;
	public static void main(String[] args) {
        new Client().run();
	}
	public void run() {
		nodepad = new TextEditor();
		Command copyCommand = new CopyCommand(1);
		Command pasteCommand = new PasteCommand();
		Command CutCommand = new CutCommand();

		nodepad.setCommand(copyCommand);
		nodepad.executeCommand();

		nodepad.setCommand(pasteCommand);
		nodepad.executeCommand();

		nodepad.setCommand(CutCommand);
		nodepad.executeCommand();

	}

}