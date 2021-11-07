package src.main.java.typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();

        System.out.println(conversion.convertDoubleToDouble(12.6));
        System.out.println(conversion.getFirstDecimal(12.3456));

        int[] array = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(array)));
    }

}
