package src.main.java.finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        List<String> DAYS = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        System.out.println(DAYS);
        DAYS.set(1, "Wednesday");
        System.out.println(DAYS);
    }
}
