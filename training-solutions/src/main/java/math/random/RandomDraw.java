package src.main.java.math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public List<String> winners = Arrays.asList("Joslyn Solomon","Ernest Marquez","Layton Mclean",
            "Lizbeth Noble","Kendra Fitzgerald","Jamison Garza","Terrance French","Darwin Leblanc",
            "Adriel Frey","Raegan Woods");

    Random random = new Random();

    int draw01 = random.nextInt(1,6);
    int draw02 =random.nextInt(6,11);
}
