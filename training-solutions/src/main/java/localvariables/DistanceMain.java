package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(21,true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int sumDistance = (int) distance.distanceInKm;
        System.out.println(sumDistance + "km távolság");
    }
}
