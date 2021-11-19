package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;

public class CodesMain {
    public static void main(String[] args) {
        Codes codes = new Codes();

        System.out.println(codes.getCodesStartWithLetter(
                new ArrayList<String>(Arrays.asList("T57fbj", "xtcu45", "f578GVHd", "wejti323"))));
    }
}