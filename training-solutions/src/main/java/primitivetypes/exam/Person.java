package src.main.java.primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate yearOfbirth;
    private int zipCode;
    private double results;

    public Person(String name, LocalDate yearOfbirth, int zipCode, double results) {
        this.name = name;
        this.yearOfbirth = yearOfbirth;
        this.zipCode = zipCode;
        this.results = results;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", yearOfbirth=" + yearOfbirth +
                ", zipCode=" + zipCode +
                ", results=" + results +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfbirth() {
        return yearOfbirth;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getResults() {
        return results;
    }
}

