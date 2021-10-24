package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen autó típus legyen?");
        String carType = scanner.nextLine();

        System.out.println("Milyen motor típus legyen?");
        String engineType = scanner.nextLine();

        System.out.println("Hány ajtós típus legyen?");
        int door = scanner.nextInt();

        System.out.println("Hány személyes típus legyen?");
        int person = scanner.nextInt();

        Car car = new Car(carType, engineType, door, person);
        System.out.println(car.getCarSum());
    }
}

