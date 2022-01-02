package interfacerules.commonproperties;

public class Equator implements Name,Length{
    private static final String NAME = "Equator";
    private static final double LENGHT = 40075;

    @Override
    public double getLength(){
        return LENGHT;
    }
    @Override
    public String getName(){
        return NAME;
    }
}
