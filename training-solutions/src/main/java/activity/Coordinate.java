package activity;

public class Coordinate {
    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        validateCoordinates(longitude, latitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void validateCoordinates(double latitude, double longitude) {
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude is between -180 and 180.");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude is between -90 and 90.");
        }
    }
}