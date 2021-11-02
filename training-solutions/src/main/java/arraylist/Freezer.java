package main.java.arraylist;


import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        groceries.add("0.5 kg krumpli");
        groceries.add("2 kg csirke mell");
        groceries.add("1 kg sajt");
        groceries.add("0.6 kg hal filé");
        groceries.add("10 tojás");

        System.out.println(groceries);
        System.out.println(groceries.size());

        groceries.remove("2 kg csirke mell");
        groceries.remove("10 tojás");

        System.out.println(groceries);
        System.out.println(groceries.size());
    }
}