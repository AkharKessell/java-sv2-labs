package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Ház", 120.2, 3);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Zene iskola", 100.1, 2, 4);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());

    }
}
