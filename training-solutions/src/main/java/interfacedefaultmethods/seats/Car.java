package interfacedefaultmethods.seats;

public class Car implements Seat {
    private final int numberOfSeats;
    private final String name;

    public Car(int numberOfSeats, String name) {
        this.numberOfSeats = numberOfSeats;
        this.name = name;
    }

    @Override
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getName() {
        return name;
    }
}