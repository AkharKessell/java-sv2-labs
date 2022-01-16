package operators;

public class OperatorsMain {
    public static void main(String[] args) {
        Operators operators = new Operators();

        System.out.println(operators.isNull("Null"));
        System.out.println(operators.isEmpty("something"));
        System.out.println(operators.getResultOfDivision(10,5));
        System.out.println(operators.isEven(4));
        System.out.println(operators.isBinary(5));
    }
}
