package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        System.out.println(Position.valueOf("CHIEFCLOUDOFFICER").getSalary()+" USD");
        System.out.println(Position.valueOf("CHIEFCREATIVOFFICER").getSalary()+" USD");
        System.out.println(Position.valueOf("CHIEFDIGITALOFFICER").getSalary()+" USD");
        System.out.println(Position.valueOf("CHIEFCLOUDOFFICER").getBenefit());
        System.out.println(Position.valueOf("CHIEFCREATIVOFFICER").getBenefit());
        System.out.println(Position.valueOf("CHIEFDIGITALOFFICER").getBenefit());

    }
}
