package interfaces.animal;

public class Lion implements Animal {
    private final String name = "Lion";
    private final int numberOfLegs = 4;

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    @Override
    public String getName() {
        return name;
    }
}
