package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    public String getDeletedFlights(){
        StringBuilder stringBuilder = new StringBuilder("Törölt járatok:");
        for (Flight plane: flights){
            if (plane.getStatus() == Status.DELETED){
                stringBuilder.append("\n");
                stringBuilder.append(plane.getFlightNumber());
            }
        }
        return stringBuilder.toString();
    }
}
