package conventions;

public class Car {

    private String carType;
    private String engineType;
    private int door;
    private int person;

    public Car(String carType, String engineType, int doors, int persons) {
        this.carType = carType;
        this.engineType = engineType;
        this.door = doors;
        this.person = persons;
    }
    public int getPersons() {
        return this.person;
    }
    public String getCarType() {
        return this.carType;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public int getDoors() {
        return this.door;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public void setDoors(int doors) {
        this.door = doors;
    }
    public void setPersons(int persons) {
        this.person = persons;
    }
    public String getCarSum() {
        return this.carType+"+"+this.engineType+"+"+this.door+"ajtó"+"+"+this.person+"személy";
    }
}