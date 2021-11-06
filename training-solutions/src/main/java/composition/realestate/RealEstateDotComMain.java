package src.main.java.composition.realestate;

public class RealEstateDotComMain {
    public static void main(String[] args) {
        Address address = new Address("Whasington","12345","Lenon Str.",6);
        Details details = new Details("New Brick building with great view",address,15,506);
        RealEstate estate = new RealEstate("For Sale",2_600_000.0,details);

        System.out.println(estate.toString());
        System.out.println();
        System.out.println(estate.getDetails().getAddress().toString());
    }

}
