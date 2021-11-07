package src.main.java.formatlocaleprintf;

public class RunMain {
    public static void main(String[] args) {
        Run run = new Run("John");

        run.addRun(4.1);
        run.addRun(3.1);
        run.addRun(2.1);
        run.addRun(1.1);
        run.addRun(5.1);

        System.out.println(run.printFormattedRunText());
    }
}

