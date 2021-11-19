package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistrationMain {
    public static void main(String[] args) {
        Exam exam = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.println("First participant name");
        String name = scanner.nextLine();
        System.out.println("Year of Birth?");
        int yearOfbirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Month of birth?");
        int monthOfbirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Day of Birth?");
        int dayOfbirth = Integer.parseInt(scanner.nextLine());
        System.out.println("ZIP Code?");
        int zipCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Vizsgaeredmény:");
        double results = Double.parseDouble(scanner.nextLine());
        LocalDate dateOfbirth = LocalDate.of(yearOfbirth,monthOfbirth,dayOfbirth);
        Person person = new Person(name,dateOfbirth,zipCode,results);
        exam.addPerson(person);
        System.out.println(exam.getPerson().toString());
    }
}
