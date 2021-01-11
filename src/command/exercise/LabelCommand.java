
package command.exercise;

import command.exercise.commands.History;
import command.exercise.commands.UndoableCommand;

/**
 * Label Command
 */
public class LabelCommand implements UndoableCommand {

    private String prevLabel;
    private String label;
    private VideoEditor video;
    private History history;

    public LabelCommand(VideoEditor video, History history) {
        this.video = video;
        this.history = history;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void execute() {
        prevLabel = video.getLabel();
        video.setLabel(label);
        history.push(this);
    }

    @Override
    public void unexecute() {
        video.setLabel(prevLabel);
    }

}