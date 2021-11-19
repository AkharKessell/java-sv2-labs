package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description; // : a túra leírása.
    private LocalDate startTime; // : a túra kezdő dátuma.
    private int numberOfPeople; // : a túrázó csapat létszáma.
    private double kms; // : a túrán megtett kilométerek.

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public double ride(double km){
        return kms += km;
    }

    public int registerPerson(int person){
        return numberOfPeople += person;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
}
