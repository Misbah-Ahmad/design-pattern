package state.exercise;

public class Main {
    public static void main(String[] args) {
        
        Point source = new Point(4, 10);
        Point destination = new Point(15, 25);
        DirectionService directionService = new DirectionService(source, destination);


        TravelRouter driveRouter = new Drive();
        TravelRouter bicycle = new BiCycle();
        TravelRouter walk = new Walk();
        // Get Drive Eta
        System.out.println("Drive distance: " + directionService.getEta(driveRouter));
        
        // Get BiCycle Eta
        System.out.println("BiCycle distance: " + directionService.getEta(bicycle));

        // Get Walk Eta
        System.out.println("Walk distance: " + directionService.getEta(walk));

    }
}
