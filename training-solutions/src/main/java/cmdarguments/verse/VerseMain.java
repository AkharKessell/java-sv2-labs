package src.main.java.cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        for (String i: args) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (var i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }

}
