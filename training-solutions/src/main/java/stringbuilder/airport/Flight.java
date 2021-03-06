package stringbuilder.airport;

public class Flight {
    private String flightNumber;
    private Status status;

    public Flight(String flightNumber, Status status) {
        this.flightNumber = flightNumber;
        this.status = status;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
