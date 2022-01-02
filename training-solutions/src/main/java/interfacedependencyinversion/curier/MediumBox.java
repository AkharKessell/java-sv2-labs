package interfacedependencyinversion.curier;

public class MediumBox implements Box{
    private final int price = 2000;

    @Override
    public Size getSize() {
        return Size.M;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
