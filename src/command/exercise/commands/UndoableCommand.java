
package command.exercise.commands;

/**
 * Command
 */
public interface UndoableCommand extends Command {
    public void unexecute();
}