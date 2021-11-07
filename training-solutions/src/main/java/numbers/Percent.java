package src.main.java.numbers;

public class Percent {

    private int a;
    private int b;

    //kiszámolja az első számnak a második szám szerinti százalékát!
    public double getValue(int a, int b) {
        return (b / 100.0) * a;
    }

    //kiszámolja, hogy az első szám minek a második szám szerinti százaléka
    public double getBase(int a, int b) {
        return a * 100.0 / b;
    }

    //kiszámolja, hogy az elsőnek hány százaléka a második
    public double getPercent(int a, int b) {
        return (double) b / (double) a * 100.0;
    }
}
