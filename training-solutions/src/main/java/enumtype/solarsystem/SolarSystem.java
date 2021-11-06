package src.main.java.enumtype.solarsystem;

public enum SolarSystem {
    MERCURY(0), VENUS(0), EARTH(1), MARS(2), JUPITER(67), SATURN(62), URANUS(27), NEPTUNE(14), dwarfPLUTO(5), dwarfERIS(1), dwarfHAUME(2), dwarfORCUS(1), dwarfQUAOAR(1);

    private final int value;

    SolarSystem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
