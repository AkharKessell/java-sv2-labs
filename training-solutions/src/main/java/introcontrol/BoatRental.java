package src.main.java.introcontrol;

public class BoatRental {
    public static void main(String[] args) {
        System.out.println("Under Construction :) ");
    }
}
//Gyakorlati feladat - Csónakok
//Egy csónakkölcsönzőben van 3 csónak. Az elsőben 5-en, a másodikban 3-an, a harmadikban 2-en férnek el. Amikor jön egy csoport, és szeretne csónakot bérelni, akkor úgy kell kiadni nekik a csónakokat, hogy miután kihajóznak, a lehető legtöbb hely és csónak maradjon bent egy következő csoportnak.
//
//Például ha 6-an jönnek, akkor az öt- és kétszemélyes csónakot kell kiadni nekik, mert így még akár egy 3 fős csapat is ki tud hajózni.
//
//Ha 5-en jönnek, akkor az 5 személyes csónakot kell kiadni nekik, mert így 2 csónak összesen 5 hellyel marad bent.
//
//Készíts egy BoatRental osztályt, ahol a main() metódusban bekéred az érkező csapat létszámát, majd írd ki, hogy melyik csónakokat vitték el és még hány fő mehet utánuk! Ha többen voltak, mint 10, akkor jelezd, hogy maradtak még a parton!