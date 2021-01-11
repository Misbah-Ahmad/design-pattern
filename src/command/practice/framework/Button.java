package command.practice.framework;

public class Button {
    
    public void click(ButtonCallback callback) {
        callback.execute();
    }

    public interface ButtonCallback {
        public void execute();
    }

}
