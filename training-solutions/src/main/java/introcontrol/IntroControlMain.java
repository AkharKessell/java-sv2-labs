package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("-10 < 10");
        System.out.println(introControl.subtractTenIfGreaterThanTen(0));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));
        System.out.println(introControl.subtractTenIfGreaterThanTen(15));

        System.out.println("describeNumber");
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(2));

        System.out.println("greetingToJoe");
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Jane"));

        System.out.println("calculateBonus");
        System.out.println(introControl.calculateBonus(0));
        System.out.println(introControl.calculateBonus(100));
        System.out.println(introControl.calculateBonus(1_000_000));
        System.out.println(introControl.calculateBonus(1_000_090));

        System.out.println("calculateConsumption");
        System.out.println(introControl.calculateConsumption(10, 20));
        System.out.println(introControl.calculateConsumption(9990, 10));

        System.out.println("printNumbers");
        introControl.printNumbers(5);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(10, 5);

        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(10, 15);
        System.out.println("printNumbersBetweenAnyDirection-backwards");
        introControl.printNumbersBetweenAnyDirection(15, 10);

        System.out.println("printOddNumbers - 1");
        introControl.printOddNumbers(3);
        System.out.println("printOddNumbers - 10");
        introControl.printOddNumbers(5);
        System.out.println("printOddNumbers - 11");
        introControl.printOddNumbers(6);
    }
}