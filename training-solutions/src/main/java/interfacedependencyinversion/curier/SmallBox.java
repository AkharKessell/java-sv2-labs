package interfacedependencyinversion.curier;

public class SmallBox implements Box {
    private final int price = 1000;

    @Override
    public Size getSize() {
        return Size.S;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
