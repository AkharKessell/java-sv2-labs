package src.main.java.classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek, add meg az első egész számot!");
        int firstNumber = scanner.nextInt();

        System.out.println("Kérlek, add meg a második egész számot!");
        int secondNumber = scanner.nextInt();

        System.out.println("számaid:"+firstNumber+"+"+secondNumber+"=");

        System.out.println(firstNumber+secondNumber);
    }
}