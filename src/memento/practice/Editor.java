package memento.practice;

public class Editor {
    public String content;

    private EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState editorState) {
        content = editorState.getContent();
    }

    public String getContent() {
        return content;
    }

    public EditorState setContent(String content) {
        this.content = content;
        return createState();
    }    
}
