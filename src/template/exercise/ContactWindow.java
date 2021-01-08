package template.exercise;

import template.exercise.core.Window;

public class ContactWindow extends Window {

    @Override
    protected void onCreate() {
        System.out.println("Creating Contact Window");
    }

    @Override
    protected void onClose() {
        System.out.println("Closing Contact Window");
    }

}
