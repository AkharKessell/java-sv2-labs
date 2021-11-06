package src.main.java.compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class Software {
    private List<Software> softwares = new ArrayList<>();
    private String name;
    private double numberOFVersion;

    public Software(String name, double numberOFVersion) {
        this.name = name;
        this.numberOFVersion = numberOFVersion;
    }

    @Override
    public String toString() {
        return "name= " + name + " version= " + numberOFVersion;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<Software> softwares) {
        this.softwares = softwares;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOFVersion() {
        return numberOFVersion;
    }

    public void setNumberOFVersion(double numberOFVersion) {
        this.numberOFVersion = numberOFVersion;
    }
}
