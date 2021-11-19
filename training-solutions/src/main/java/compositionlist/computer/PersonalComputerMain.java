package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("intel", 1.8);
        PersonalComputer pc = new PersonalComputer(cpu);

        pc.addHardware(new Hardware("videocard", "PCI-E"));
        pc.addHardware(new Hardware("motherboard", "atx"));
        pc.addSoftware(new Software("OS", 10.0));
        pc.addSoftware(new Software("Office", 365.0));

        System.out.println(pc.toString());

    }
}
