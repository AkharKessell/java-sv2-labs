package main.java.array;

public class ArrayHandlerMain {
    public static void main(String[] args) {
        int [] numbers = {4, 7 , 11, 3 ,95};
        String [] words = {"Lovak", "Kutyák", "Macskák", "Nyulak"};

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.addIndexToNumber(numbers);
        for (int item: numbers){
            System.out.println(item);
        }
        for (int item: numbers) {
            System.out.println(item+ ", ");
        }
        System.out.println();

        arrayHandler.concatenateIndexToWord(words);
        for ( String item: words) {
            System.out.println(item);
        }
        for (String item: words) {
            System.out.println(item+ ", ");
        }
    }
}
