package template.exercise;

import template.exercise.core.Window;

public class HomeWindow extends Window {

    @Override
    protected void onCreate() {
        System.out.println("Creating Home Window");
    }

    @Override
    protected void onClose() {
        System.out.println("Closing Home Window");
    }

}
