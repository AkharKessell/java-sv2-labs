package src.main.java.enumtype.position;

public enum Position {
    CHIEFCLOUDOFFICER(35000, "Free travel in the clouds"),
    CHIEFCREATIVOFFICER(40000, "Free paint"),
    CHIEFDIGITALOFFICER(45000, "Free bits and pieces");

    private final int salary;
    private final String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
