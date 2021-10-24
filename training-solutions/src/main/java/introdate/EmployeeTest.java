package introdate;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dolgozó Neve?");
        String name = scanner.nextLine();

        System.out.println("Milyen évben született? (számmal)");
        int year = scanner.nextInt();

        System.out.println("Milyen hónapban született? (számmal)");
        int month = scanner.nextInt();

        System.out.println("Milyen napon született? (számmal) ");
        int day = scanner.nextInt();

        Employee employee = new Employee(year, month, day, name);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés időpontja: " + employee.getBeginEmployment());

        System.out.println("Mire változtassuk meg a nevet?");
        scanner.nextLine();
        name = scanner.nextLine();

        employee.setName(name);

        System.out.println("Név: " + employee.getName());
        System.out.println("Születési idő: " + employee.getDateOfBirth());
        System.out.println("Belépés időpontja: " + employee.getBeginEmployment());
    }
}
