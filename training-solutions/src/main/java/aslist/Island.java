package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        Island island = new Island();
        Scanner scanner = new Scanner(System.in);
        List<String> importantThings = Arrays.asList("water", "shovel", "radio");

        System.out.println("You can only bring 3 things?");
        System.out.println("You have: " + importantThings);
        System.out.println();
        System.out.println("Choose another thing instead, choose a number!");
        System.out.println("Which one:");
        int index = scanner.nextInt() - 1;
        scanner.nextLine();
        System.out.println("For what?");
        String thing = scanner.nextLine();
        importantThings.set(index, thing);
        System.out.println("You bring:");
        System.out.println(importantThings);
    }
}
