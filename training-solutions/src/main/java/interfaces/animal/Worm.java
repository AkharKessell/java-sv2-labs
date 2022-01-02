package interfaces.animal;

public class Worm implements Animal {
    private final String name = "Worm";
    private final int numberOfLegs = 0;

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}