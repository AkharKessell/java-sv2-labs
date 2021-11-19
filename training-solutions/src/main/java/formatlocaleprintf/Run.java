package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> data = new ArrayList<>();
    private String name;

    public Run(String name) {
        this.name = name;
    }

    public void addRun(double km) {
        data.add(km);
    }

    public String printFormattedRunText() {
        LocalDate actual = LocalDate.now();
        int numOfRun = this.data.size();
        double lastRun = this.data.get(numOfRun - 1);
        return String.format("Dear %s! This week this is your %d. run. You ran %f kms. Great!", this.name, numOfRun, lastRun);
    }
}