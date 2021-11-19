package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

        public static void main(String[] args) {
            Favourites favourites = new Favourites();
            Scanner scanner = new Scanner(System.in);
            List<String> favouriteThings = new ArrayList<>();

            System.out.println("We need a list for your favourite things. PUSH!");
            scanner.nextLine();

            System.out.println("Favourite movie?");
            String movie = scanner.nextLine();
            favouriteThings.add(movie);

            System.out.println("Favourite color?");
            String actor = scanner.nextLine();
            favouriteThings.add(actor);

            System.out.println("Favourite car?");
            String colour = scanner.nextLine();
            favouriteThings.add(colour);

            System.out.println("Favourite animal?");
            String animal = scanner.nextLine();
            favouriteThings.add(animal);

            System.out.println(favouriteThings.size());
            System.out.println(favouriteThings);
        }
    }
