package command.practice;

import command.practice.framework.Button;

public class CustomerAdder implements Button.ButtonCallback {

    @Override
    public void execute() {
        System.out.println("Adding Customers");
    }
    
}
