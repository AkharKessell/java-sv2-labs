package src.main.java.stringbasic;

public class Student {
    private Person person;
    private String neptunCode;
    private String eduId;
    private String entryCardId;

    public Student(Person person, String neptunCode, String eduId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.eduId = eduId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEduId() {
        return eduId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public String getEntryCardId() {
        return entryCardId;
    }

    public void setEntryCardId(String entryCardId) {
        this.entryCardId = entryCardId;
    }
}
