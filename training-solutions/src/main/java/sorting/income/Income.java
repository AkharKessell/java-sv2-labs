package sorting.income;

import java.util.Arrays;

public class Income {
    private int[] income;

    public Income(int[] income) {
        this.income = income;
    }

    public int[] getIncome() {
        return income;
    }

    public int getHighestIncome() {
        Arrays.sort(income);
        return income[income.length - 1];
    }
}