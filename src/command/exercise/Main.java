package command.exercise;

import java.util.Stack;

import command.exercise.commands.History;

public class Main {
    public static void main(String[] args) {
        VideoEditor videoEditor = new VideoEditor(1.5, "Yooo", new Video());
        History history = new History(new Stack<>());
        
        LabelCommand labelCommand = new LabelCommand(videoEditor, history);
        UndoCommand undoCommand = new UndoCommand(history);
        labelCommand.setLabel("Yooo");
        labelCommand.execute();
        System.out.println(videoEditor.toString());

        labelCommand.setLabel("Yoooooooo2");
        labelCommand.execute();
        System.out.println(videoEditor.toString());

        undoCommand.setHistory(history);
        undoCommand.execute();
        System.out.println(videoEditor.toString());

        undoCommand.execute();
        System.out.println(videoEditor.toString());

    }
}
