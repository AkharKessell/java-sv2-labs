package src.main.java.classstructureattributes;

import java.sql.SQLOutput;

public class MusicMain {

    public static void main(String[] args) {

        Song song = new Song(); // 1
        song.band = "Britney Spears";
        song.title = "Oops!...I Did It Again";
        song.lenght = 4;

        System.out.println("#Előadó: "+song.band + " #Cím: "+song.title+" #Hossz: "+song.lenght+"(perc)");
    }

}
