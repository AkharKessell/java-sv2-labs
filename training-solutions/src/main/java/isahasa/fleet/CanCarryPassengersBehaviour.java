package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {
    private final int maxPassangers;
    private int passengers;

    public CanCarryPassengersBehaviour(int maxPassangers) {
        this.maxPassangers = maxPassangers;
    }

    @Override
    public int loadPassenger(int passengers) {
        this.passengers = Math.min(passengers, maxPassangers);
        return Math.abs(Math.min(maxPassangers - passengers, 0));
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}