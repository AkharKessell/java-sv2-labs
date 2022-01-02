package interfaces.animal;

public class Duck implements Animal {
    private final String name = "Duck";
    private final int numberOfLegs = 2;

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
