package localvariables;

public class Distance {
    double distanceInKm;
    boolean exact;

    public Distance(double distanceInKm, boolean exact) {
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public boolean isExact(){
        return this.exact;
    }

    public double getDistanceInKm() {
        return this.distanceInKm;
    }
}
