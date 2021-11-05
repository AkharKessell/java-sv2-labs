package src.main.java.introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {
    public static void main(String[] args) {
        CyclingTour cycling = new CyclingTour("Tour", LocalDate.of(2001, 5, 15));
        System.out.println(cycling.getDescription());
        System.out.println(cycling.getStartTime());
        System.out.println(cycling.getNumberOfPeople());
        System.out.println(cycling.getKms());

        cycling.registerPerson(20);
        cycling.ride(102);

        System.out.println(cycling.getDescription());
        System.out.println(cycling.getStartTime());
        System.out.println(cycling.getNumberOfPeople());
        System.out.println(cycling.getKms());
    }
}