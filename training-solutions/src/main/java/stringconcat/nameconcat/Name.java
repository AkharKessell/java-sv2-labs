package src.main.java.stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        return title.getTitle() + " " + givenName + " " + middleName + " " + familyName;
    }

    public String concatNameHungarianStyle() {
        return familyName.concat(" ".concat(middleName.concat(" ".concat(givenName))));
    }
}
