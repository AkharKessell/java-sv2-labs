package src.main.java.numbers;

public class PercentMain {
    public static void main(String[] args) {
        Percent percent = new Percent();

        System.out.println(percent.getValue(200, 30) + "%");
        System.out.println(percent.getBase(200, 30) + "%");
        System.out.println(percent.getPercent(200, 30) + "%");
    }
}
