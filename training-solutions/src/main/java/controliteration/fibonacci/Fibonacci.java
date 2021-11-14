package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("How many items in the fibonacci series do you want to get?\n");
        int number = scanner.nextInt();
        System.out.print("0 1 ");
        int numberBefore = 0;
        int numberActual = 1;
        int newNumber;
        int i = 3;
        while (i <= number) {
            newNumber = numberBefore + numberActual;
            System.out.print(newNumber + " ");
            numberBefore = numberActual;
            numberActual = newNumber;
            i++;
        }

        System.out.println("How many items do you want to get from another fibonacci series?\n");
        number = scanner.nextInt();
        List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0, 1));

        for (int j = 2; j < number; j++) {
            fibonacci.add(fibonacci.get(j - 1) + fibonacci.get(j - 2));
        }

        for (int k = 0; k < number; k++) {
            System.out.print(fibonacci.get(k) + " ");
        }
    }
}