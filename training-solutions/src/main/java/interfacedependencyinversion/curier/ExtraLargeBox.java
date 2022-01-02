package interfacedependencyinversion.curier;

public class ExtraLargeBox implements Box{
    private final int price = 5000;

    @Override
    public Size getSize() {
        return Size.XL;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
