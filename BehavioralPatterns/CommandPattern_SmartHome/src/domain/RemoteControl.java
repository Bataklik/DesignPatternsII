package domain;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

	private Map<Integer, Command> commands;

	public RemoteControl() {
		commands = new HashMap<>();
	}

	public void setCommand(int slot, Command cmd) {
		commands.put(slot,cmd);
	}

	public void pressButton(int slot) {
		Command cmd = commands.get(slot);
		cmd.execute();
	}

}