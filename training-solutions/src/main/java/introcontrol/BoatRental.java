package main.java.introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args){
        int numberOfBoats = 3;
        int remainingPlaces = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many people?");
        int people = scanner.nextInt();

        if (people > 3) {
            System.out.println("boat taken: 3. boat (5 left).");
            people -= 5;
            remainingPlaces -= 5;
            numberOfBoats--;
        }
        if (people > 2) {
            System.out.println("boat taken: 2. boat (3 left).");
            people -= 3;
            remainingPlaces -= 3;
            numberOfBoats--;
        }
        if (people > 0) {
            System.out.println("boat taken: 1. boat (2 left).");
            people -= 2;
            remainingPlaces -= 2;
            numberOfBoats--;
        }

        if (people > 0) {
            System.out.println("no more room for " + people + " ppl.");
        } else {
            System.out.println("remaining: " + remainingPlaces + " places.");
            System.out.println("remaining boat: " + numberOfBoats + " boat.");
        }
    }
}
