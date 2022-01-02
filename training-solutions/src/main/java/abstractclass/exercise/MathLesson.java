package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise adder = new Adder();
        System.out.println("ADD :" + adder.getSolution(1,1));

        MathExercise divisor = new Divisor();
        System.out.println("DIV :" + divisor.getSolution(1,1));

        MathExercise subtracter = new Subtracter();
        System.out.println("SUB :" + subtracter.getSolution(5,1));

        MathExercise multiplier = new Multiplier();
        System.out.println("MUL :" + multiplier.getSolution(5,2));

    }
}
