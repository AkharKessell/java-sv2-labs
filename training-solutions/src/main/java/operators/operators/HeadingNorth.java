package operators.operators;

public class HeadingNorth {

    public int getNumberOfNewDirections() {
        int degree = 0;
        int turn = 0;

        for (int i = 0; i < 360; i += degree) {
            degree += 10;
            turn ++;
        }
        return turn;
    }
}


