package src.main.java.enumtype.solarsystem;

import java.util.Arrays;

public class SolarSystemMain {
    public static void main(String[] args) {

        for( SolarSystem s: SolarSystem.values()){
            System.out.println(s + " - number of moons: " + s.getValue());
        }
    }
}
