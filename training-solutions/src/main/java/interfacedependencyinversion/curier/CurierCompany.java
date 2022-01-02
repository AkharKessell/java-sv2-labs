package interfacedependencyinversion.curier;

public class CurierCompany {
    public static void main(String[] args) {
        SmallBox sb = new SmallBox();
        System.out.println(sb.getPrice());
        System.out.println(sb.getSize());

        MediumBox mb = new MediumBox();
        System.out.println(mb.getPrice());
        System.out.println(mb.getSize());

        LargeBox lb = new LargeBox();
        System.out.println(lb.getPrice());
        System.out.println(lb.getSize());

        ExtraLargeBox elb = new ExtraLargeBox();
        System.out.println(elb.getPrice());
        System.out.println(elb.getSize());
    }
}
