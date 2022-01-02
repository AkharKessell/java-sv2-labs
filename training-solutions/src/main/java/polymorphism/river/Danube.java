package polymorphism.river;

import java.util.ArrayList;
import java.util.List;

public class Danube extends River {
    private List<String> capitals = new ArrayList<>();

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Duna", 3500, List.of("Ulm", "Regensburg", "Linz"));
        River river = new Danube("Duna", 2850, List.of("Vienna", "Győr", "Apati"));
        Danube danube = new Danube("Duna", 940, List.of("Budapest", "Severin", "Sulina"));

        System.out.println(water.getClass());
        System.out.println(river.getLength());
        System.out.println(river.getName());
        System.out.println(river.getClass());
        System.out.println(danube.getLength());
        System.out.println(danube.getName());
        System.out.println(danube.getCapitals());
        System.out.println(danube.getClass());

    }

    public List<String> getCapitals() {
        return capitals;
    }
}