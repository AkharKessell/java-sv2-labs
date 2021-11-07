package src.main.java.stringconcat.employee;

public class Employee {
    protected String name;
    protected String job;
    protected int salary;

    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + Integer.toString(salary) + " Ft";
    }
}
