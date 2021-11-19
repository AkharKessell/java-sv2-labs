package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        //Fűzd össze szövegként az 1 és 2 literált! Milyen megoldásokat ismersz?
        String i = "1" + "2";
        System.out.println(i);
        System.out.println(Integer.toString(1) + Integer.toString(2));
        System.out.println("Concat to String:" + 1 + 2);
        //Vedd a 3 és a 4 hányadosát, és tárold el a double quotient változóban,
        // majd írd ki! Mi lesz az eredmény? Miért van ez így?
        // Hogyan lehet ezt pontosítani kizárólag literálok használatával?
        double quotient = 3 / 4;
        System.out.println(quotient); //0.0
        quotient = 3.0 / 4.0;
        System.out.println(quotient); //0.75
        //Definiáld a 3_244_444_444 literált, és add értékül a long big változónak! Írd is ki!
        //long big = 3_244_444_444;
        //System.out.println(big); //to big
        long big = 3_244_444_444L;
        System.out.println(big); //ok
        //Definiálj egy String word változót, melynek az értéke legyen a TITLE szöveg nagybetűkkel!
        // A szövegliterál eredetileg kisbetűkből álljon, és hajtsuk végre rajta a toUpperCase() metódust az értékadás előtt!
        String word = "title";
        System.out.println(word.toUpperCase());
        //Írasd ki az 1 és a -2 értéket bináris formájában! Keresgélj az Integer osztály metódusai között!
        int number = 1;
        System.out.println(Integer.toBinaryString(number));
        number = -2;
        System.out.println(Integer.toBinaryString(number));
    }
}
