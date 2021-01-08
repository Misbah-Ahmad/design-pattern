package template.exercise.core;

public abstract class Window {

    private boolean isCreated = false;

    public void create() {

        System.out.println("Preparing the window to be created");
        // Call client implemented method before finishing create
        this.onCreate();
        isCreated = true;
    }

    protected abstract void onCreate();

    public void close() throws Exception {
        if (!isCreated) {
            System.out.println("Throwing window null exception");
            throw new Exception("Invalid call to close window, window was not created");
        }
        // Call client implemented method before closing
        this.onClose();
        System.out.println("Removing the window from the screen");
        isCreated = false;
    }

    protected abstract void onClose();
}
