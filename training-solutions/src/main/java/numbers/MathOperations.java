package src.main.java.numbers;

public class MathOperations {

    private int a;
    private int b;
    private int c;
    private int d;
    private double difference =  0.0001;

    public double allOperator(double a, double b, double c, double d) {
        return (a + (b - c) * d) / a;
    }

    public boolean countValues(double userInput, double operatorOutput) {
        return Math.abs(userInput - operatorOutput) < difference;
    }

}
