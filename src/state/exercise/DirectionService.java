package state.exercise;

import java.util.List;

public class DirectionService {

    private Point source, destination;

    public DirectionService(Point source, Point destination) {
        this.source = source;
        this.destination = destination;
    }

    public int getEta(TravelRouter travelRouter) {
        return travelRouter.getEta(source, destination);
    }

    public List<Point> getDirection(TravelRouter travelRouter) {
        return travelRouter.getDirection(source, destination);
    }

    public void markDirection(TravelRouter travelRouter) {
        travelRouter.markDirection(getDirection(travelRouter));
    }

}
