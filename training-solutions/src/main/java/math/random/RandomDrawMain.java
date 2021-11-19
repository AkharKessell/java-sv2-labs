package math.random;

public class RandomDrawMain {
    public static void main(String[] args) {
        RandomDraw draw = new RandomDraw();

        System.out.println("Winner 01: " + draw.winners.get(draw.draw01 - 1));
        System.out.println("Winner 02: " + draw.winners.get(draw.draw02 - 1));
    }
}
