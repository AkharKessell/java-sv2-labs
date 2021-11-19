package formatlocaleprintf;

public class ThanksMain {
    public static void main(String[] args) {
        Thanks thanks = new Thanks();

        for (String name : thanks.getNames()) {
            System.out.printf("Kedves %s! Örülünk, hogy a termékünket választotta.\n", name);
        }
    }
}