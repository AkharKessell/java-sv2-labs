package src.main.java.looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for ( var i = 1; i < numbers.length; i++) {
            System.out.println((numbers[i] + numbers[i-1]) + "");
        }
    }
}
