package memento.practice;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) throws Exception {
        EditorState currentState;
        Editor editor = new Editor();
        History history = new History();

        currentState = editor.setContent("one");
        history.push(currentState);

        currentState = editor.setContent("two");
        history.push(currentState);

        currentState = history.pop();
        editor.restore(currentState);
        System.out.println(editor.getContent());

        currentState = editor.setContent("three");
        history.push(currentState);

        currentState = history.pop();
        editor.restore(currentState);
        System.out.println(editor.getContent());

    }
}
