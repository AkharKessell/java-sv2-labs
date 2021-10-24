package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány óra (h):");
        int hour = scanner.nextInt();

        System.out.println("Hány perc (m):");
        int minute = scanner.nextInt();

        System.out.println("Hány másodperc (s):");
        int second = scanner.nextInt();

        Time timeA = new Time(hour, minute, second);

        System.out.println("Hány óra (h):):");
        hour = scanner.nextInt();

        System.out.println("Hány perc (m):");
        minute = scanner.nextInt();

        System.out.println("Hány másodperc (s):");
        second = scanner.nextInt();

        Time timeB = new Time(hour, minute, second);

        System.out.print("Az első időpont ");
        System.out.println(timeA.toString() + " = " + timeA.getInMinutes() + " perc");

        System.out.print("Az második időpont ");
        System.out.println(timeB.toString() + " = " + timeB.getInSeconds() + " másodperc");

        System.out.print("Az első korábbi, mint a második:  ");
        System.out.println(timeA.earlierThan(timeB));
    }
}