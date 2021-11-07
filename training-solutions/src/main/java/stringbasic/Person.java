package src.main.java.stringbasic;

public class Person {

    private String name;
    private String email;
    private String healthNumber;
    private String bankAccountNumber;
    private String phoneNumber;

    public Person(String name, String email, String healthNumber, String bankAccountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.healthNumber = healthNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHealthNumber(String healthNumber) {
        this.healthNumber = healthNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
