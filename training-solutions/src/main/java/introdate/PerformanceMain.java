package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceMain {
    public static void main(String[] args) {
        String name = "Queen";
        LocalDate date = LocalDate.of(1989,06,02);
        LocalTime timeOn = LocalTime.of(18,00);
        LocalTime timeOff = LocalTime.of(20,00);

        Performance performance = new Performance(name,date,timeOn,timeOff);
        System.out.println(performance.getInfo());
    }
}
