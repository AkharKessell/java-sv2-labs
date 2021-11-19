package finalmodifier;

import java.util.Scanner;

public class PiMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CircleCalculator circle = new CircleCalculator();
        System.out.println("Circle radius: ");
        double r = scanner.nextDouble();
        System.out.println("Circle circumference: " + circle.calculatePerimeter(r));
        System.out.println("Circle area: " + circle.calculateArea(r));
        System.out.println();

        CylinderCalculatorBasedOnCircle cylinder = new CylinderCalculatorBasedOnCircle();
        System.out.println("Cylinder radius: ");
        r = scanner.nextDouble();
        System.out.println("Cylinder height: ");
        double h = scanner.nextDouble();
        System.out.println("Cylinder volume: " + cylinder.calculateVolume(r, h));
        System.out.println("Cylinder surface: " + cylinder.calculateSurfaceArea(r, h));
        System.out.println();

        System.out.println("PI= " + CircleCalculator.PI);
    }
}