package src.main.java.stringbuilder.airport;

public class AirportMain {
    public static void main(String[] args) {
        Flight flight01 = new Flight("ADH-998", Status.ACTIVE);
        Flight flight02 = new Flight("JUS-345", Status.ACTIVE);
        Flight flight03 = new Flight("HUR-984", Status.DELETED);
        Flight flight04 = new Flight("KAS-556", Status.DELETED);

        Airport airport = new Airport();

        airport.addFlight(flight01);
        airport.addFlight(flight02);
        airport.addFlight(flight03);
        airport.addFlight(flight04);

        flight02.setStatus(Status.DELETED);

        flight03.setFlightNumber("RUS-111");

        System.out.println(airport.getDeletedFlights());
    }
}
