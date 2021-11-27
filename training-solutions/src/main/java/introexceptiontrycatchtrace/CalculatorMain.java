package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 1;
        int number2 = 1;

        try {
            System.out.println("Adj meg egy egész számot!");
            number1 = scanner.nextInt();
        } catch (InputMismatchException exc) {
            System.out.println("Nem számot adtál meg. Az alapértelmezett érték: 1");
        }
        scanner.nextLine();

        try {
            System.out.println("Adj meg még egy egész számot!");
            number2 = scanner.nextInt();
        } catch (InputMismatchException otherExc) {
            System.out.println("Nem számot adtál meg. Az alapértelmezett érték: 1");
        }
        scanner.nextLine();

        System.out.println("Adj meg egy matematikai műveletet!");
        String operator = scanner.nextLine();

        Calculator calculator = new Calculator(number1, number2, operator);

        try {
            calculator.doMath();
        } catch (ArithmeticException exc) {
            System.out.println("0-val próbáltál osztani. Nem végrehajtható művelet.");
        }
    }
}