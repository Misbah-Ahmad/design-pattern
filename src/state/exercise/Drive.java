package state.exercise;

import java.util.ArrayList;
import java.util.List;
public class Drive implements TravelRouter {

    final int distanceWeight = 2;

    @Override
    public int getEta(Point source, Point destination) {
        return Math.abs(source.getLatitute() - source.getLongitude()) + Math.abs(destination.getLatitute() - destination.getLongitude()) * distanceWeight;
    }

    @Override
    public List<Point> getDirection(Point source, Point destination) {
        
        System.out.println("Preparing direction for Driving");
        List<Point> direction = new ArrayList<>();
        direction.add(source);
        direction.add(destination);
        return direction;
    }

    @Override
    public void markDirection(List<Point> direction) {
        System.out.println("Marking direction for Driving");
        for (Point point : direction) {
            point.printPoint();
        }
    }
    
}
