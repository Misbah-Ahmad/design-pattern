package command.exercise.commands;
import java.util.Stack;

public class History {
    
    public Stack<UndoableCommand> commandHistory;

    public History(Stack<UndoableCommand> commandHistory) {
        this.commandHistory = commandHistory;
    }
    
    public void push(UndoableCommand command) {
        commandHistory.push(command);
    }

    public UndoableCommand pop() {
        return commandHistory.empty() ? null : commandHistory.pop();
    }

}
