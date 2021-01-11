package command.practice;

import command.practice.framework.Button;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.click(new Button.ButtonCallback(){
          @Override
          public void execute() {
            System.out.println("Clicked");              
          }  
        });

        // OR
        button.click(new CustomerAdder());
    }
}
