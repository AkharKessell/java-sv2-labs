package inheritancemethods.employee;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int raiseSalary (int percent){
        return (int) (salary * (100d + percent) / 100);
    }
}
