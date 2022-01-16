package collectionscomp;

import java.util.Objects;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private final String address;
    private final int area;
    private final int floors;

    public Building(String address, int area, int floors) {
        this.address = address;
        this.area = area;
        this.floors = floors;
    }

    public static void main(String[] args) {
        TreeSet<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Washington, High str 10", 1500, 3));
        buildings.add(new Building("New York, Main Str 11", 20000, 5));
        buildings.add(new Building("Berling, Hauot Str 12", 90, 1));

        System.out.println(buildings);
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public int compareTo(Building b) {
        return this.floors - b.floors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Building b = (Building) o;
        return this.floors == b.floors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors);
    }

    @Override
    public String toString() {
        return String.format("Address: %s, area: %d, floors: %d", address, area, floors);
    }
}