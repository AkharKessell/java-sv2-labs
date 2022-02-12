package activity;

public class TrackPoint {
    private final Coordinate coordinate;
    private final double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint trackPoint) {
        int earthRadiusInKm = 6371;

        double longitudeDistance = Math.toRadians(trackPoint.getCoordinate().getLongitude() - coordinate.getLongitude());
        double latitudeDistance = Math.toRadians(trackPoint.getCoordinate().getLatitude() - coordinate.getLatitude());

        double a = Math.sin(latitudeDistance / 2) * Math.sin(latitudeDistance / 2) + Math.cos(Math.toRadians(coordinate.getLatitude())) * Math.cos(Math.toRadians(trackPoint.getCoordinate().getLatitude())) * Math.sin(longitudeDistance / 2) * Math.sin(longitudeDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = earthRadiusInKm * c * 1000;

        double height = elevation - trackPoint.getElevation();

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }
}