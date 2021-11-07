package src.main.java.composition.realestate;

public class Address {

    String city;
    String zipCode;
    String street;
    int houseNumber;

    public Address(String city, String zipCode, String street, int houseNumber) {
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "CITY=' " + city + '\'' +
                "\nZIP CODE=' " + zipCode + '\'' +
                "\nSTREET NAME=' " + street + '\'' +
                "\nHOUSE NUMBER= " + houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}