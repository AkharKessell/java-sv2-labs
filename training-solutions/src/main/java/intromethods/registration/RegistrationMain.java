package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class RegistrationMain {
    public String getFullName(String lastName, String firstName) {
        return lastName + " " + firstName;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Last Name:");
        String lastName = scanner.nextLine();
        String fullName = new RegistrationMain().getFullName(firstName, lastName);

        System.out.println("YOB:");
        int year = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Day:");
        int day = scanner.nextInt();
        LocalDate dateOfBirth = new RegistrationMain().getDateOfBirth(year, month, day);

        System.out.println("Email:");
        scanner.nextLine();
        String email = scanner.nextLine();

        Person person = new Person(fullName, dateOfBirth, email);

        System.out.println("Data: " + person.toString());
    }
}