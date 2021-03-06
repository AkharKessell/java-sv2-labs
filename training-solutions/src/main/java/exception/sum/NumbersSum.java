package exception.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        try {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            return sum;
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("input can't be null", npe);
        }
    }

    public int getSum(String[] numbers) {
        try {
            int sum = 0;
            for (String n : numbers) {
                sum += Integer.parseInt(n);
            }
            return sum;
        } catch (NullPointerException npe) {
            throw new IllegalArgumentException("Input can't be null", npe);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Number can't be converted", nfe);
        }
    }
}
