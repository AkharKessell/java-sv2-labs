package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy pozitív egész számot!\n");
        int number = scanner.nextInt();

        for (; ; ) {
            if (number % 7 == 0) {
                System.out.println("X");
            } else {
                if (String.valueOf(number).contains("7")) {
                    break;
                } else {
                    System.out.println(number);
                }
            }
            number++;
        }
    }
}