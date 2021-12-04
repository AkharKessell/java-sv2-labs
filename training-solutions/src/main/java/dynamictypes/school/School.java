package dynamictypes.school;

public class School {
    private final String name;
    private final int numberOfYears;

    public School(String name, int numberOfYears) {
        this.name = name;
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numberOfYears=" + numberOfYears +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
}