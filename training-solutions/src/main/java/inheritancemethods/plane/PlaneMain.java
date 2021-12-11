package inheritancemethods.plane;

public class PlaneMain {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("John", 100_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jack", 100_000, 10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane", 100_000, 10);

        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
