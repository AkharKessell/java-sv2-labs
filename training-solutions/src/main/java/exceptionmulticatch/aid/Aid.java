package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private final int amount;

    public Aid(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(path)) {
                String townName = line.split(" ")[0];
                int population = Integer.parseInt(line.split(" ")[1]);
                result.add(townName + " " + (amount / population));
            }
            return result;
        } catch (IOException | NullPointerException | NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Something went wrong while counting.", e);
        }
    }
}