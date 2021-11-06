package src.main.java.compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {
    private List<Hardware> hardwares = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();
    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Hardware: " + hardwares + "Software: " + softwares + "CPU: " + cpu;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    public List<Hardware> getHardware() {
        return hardwares;
    }

    public List<Software> getSoftware() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
}
