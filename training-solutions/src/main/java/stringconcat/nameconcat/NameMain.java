package src.main.java.stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {

        Name name01 = new Name("Huszár", "Vágás", "János", Title.MR);
        System.out.println(name01.concatNameHungarianStyle());

        Name name02 = new Name("Hussar", "Slash", "John", Title.DR);
        System.out.println(name02.concatNameWesternStyle());
    }
}