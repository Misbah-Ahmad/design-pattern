package state.exercise;

public class Point {
    private int latitute, longitude;

    public Point(int latitute, int longitude) {
        this.latitute = latitute;
        this.longitude = longitude;
    }

    public int getLatitute() {
        return latitute;
    }

    public int getLongitude() {
        return longitude;
    }

    public void printPoint() {
        System.out.println("Latitude: " + this.getLatitute() + ", Longitude: " + this.getLongitude());
    }

}
