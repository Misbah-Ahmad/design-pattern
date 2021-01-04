package memento.practice;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<EditorState> history = new ArrayList<>();

    public void push(EditorState editorState) {
        history.add(editorState);
    }

    public EditorState pop() {
        if (history.size() <= 1) {
            history.clear();
            return null;
        }
        history.remove(history.size() - 1); // This was the last saved state
        return history.get(history.size() - 1);
    }
}
