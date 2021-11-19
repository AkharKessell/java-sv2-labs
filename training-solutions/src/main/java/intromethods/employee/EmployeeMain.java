package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 2009, 100_000);
        System.out.println(employee.getName() + " " + employee.getHiringYear()+ " " +employee.getSalary());
        employee.setName("Jack Doe");
        System.out.println(employee.getName() + " " + employee.getHiringYear()+ " " +employee.getSalary());

        employee.raiseSalary(50_000);

        System.out.println(employee.getName() + " " + employee.getHiringYear()+ " " +employee.getSalary());
        System.out.println(employee.toString());
    }
}
