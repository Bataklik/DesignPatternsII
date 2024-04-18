package domain;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private String text;
    private List<Command> commands;
    private Command activeCommand;
    public TextEditor() {
        commands = new ArrayList<>();
        text = "ABC";
    }

    public void executeCommand() {
        if (activeCommand != null) {
            activeCommand.execute();
            if (activeCommand instanceof CopyCommand){
                if (((CopyCommand) activeCommand).getCopiedIndex() > text.length() || ((CopyCommand) activeCommand).getCopiedIndex() <0){
                    System.out.println("Index is niet geldig");
                    return;
                }
                String copiedText = String.valueOf(text.charAt(((CopyCommand) activeCommand).getCopiedIndex()));
                ((CopyCommand) activeCommand).setCopiedText(copiedText);
                System.out.println("Text is " + copiedText);
            }
            commands.add(activeCommand);
            activeCommand = null;
        } else {
            System.out.println("Geen actief commando om uit te voeren.");
        }
    }

    public void setCommand(Command command) {
        activeCommand = command;
    }

}