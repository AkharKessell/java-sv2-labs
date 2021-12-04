package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private final List<String> students = Arrays.asList("John Doe", "Jack Doe", "Jane Doe", "James Doe",
            "Philip Doe", "Roland Doe", "Richard Doe", "Nory Doe", "Julia Doe", "Elmer Doe");

    public String getTodayReferringStudent(int number) {
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return students.get(number.ordinal());
    }

    public String getTodayReferringStudent(String numberName) {
        int number = Number.valueOf(numberName.toUpperCase()).getValue();
        return students.get(number - 1);
    }
}