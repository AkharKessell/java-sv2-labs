package src.main.java.numbers;

import java.util.Scanner;

public class MathOperationsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations math = new MathOperations();

        System.out.println("First number");
        double a = scanner.nextDouble();

        System.out.println("Second number");
        double b = scanner.nextDouble();

        System.out.println("Third number");
        double c = scanner.nextDouble();

        System.out.println("Forth number");
        double d = scanner.nextDouble();

        System.out.println("What is the sum of this: " + "(" + a + " + (" + b + " - " + c + ") * " + d + ") / " + a);
        double result = scanner.nextDouble();

        double calculation = math.allOperator(a, b, c, d);
        System.out.println(math.countValues(result, calculation) ? "Correct." : "Incorrect: " + calculation);
    }
}
