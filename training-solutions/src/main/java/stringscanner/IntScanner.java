package src.main.java.stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp >= 100) {
                stringBuilder.append(temp + ",");
            }
        }
        if (stringBuilder.toString().length() == 0) {
            return stringBuilder.toString();
        } else {
            return stringBuilder.substring(0, stringBuilder.toString().length() - 1);
        }
    }
}
