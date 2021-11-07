package src.main.java.mathproblems;

public class DivisionMain {
    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(10);

        int[] input = {2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10};
        division.getRightNumbers(input);
    }
}
