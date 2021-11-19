package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        int a = (int) number;
        return (double) a;
    }

    public int getFirstDecimal(double number) {
        int a = (int) number;
        double b = (number - a) * 10;
        return (int) b;
    }

    public byte[] convertIntArrayToByteArray(int[] array) {
        byte[] newArray = new byte[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || 127 < array[i]) {
                newArray[i] = (byte) -1;
            } else {
                newArray[i] = (byte) array[i];
            }
        }
        return newArray;
    }
}
