package state.exercise;

import java.util.List;

public interface TravelRouter {

    public int getEta(Point source, Point destination);
    public List<Point> getDirection(Point source, Point destination);
    public void markDirection(List<Point> direction);

}
