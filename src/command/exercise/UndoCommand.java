package command.exercise;

import command.exercise.commands.Command;
import command.exercise.commands.History;

public class UndoCommand implements Command {

    History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    public void setHistory(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.commandHistory.empty() != false) {
            history.commandHistory.pop().unexecute();
        }
    }

}
