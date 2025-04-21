package Command_Pattern;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        }
    }
}
