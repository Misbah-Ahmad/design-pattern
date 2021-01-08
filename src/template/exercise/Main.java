package template.exercise;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        HomeWindow homeWindow = new HomeWindow();
        homeWindow.create();

        ContactWindow contactWindow = new ContactWindow();
        contactWindow.create();

        try {
            contactWindow.close();
            homeWindow.close();
            // Invalid close call
            contactWindow.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}