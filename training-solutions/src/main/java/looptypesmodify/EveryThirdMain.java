package src.main.java.looptypesmodify;

import java.util.Arrays;

public class EveryThirdMain {
    public static void main(String[] args) {
        EveryThird zeros = new EveryThird();
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        zeros.changeToZero(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
