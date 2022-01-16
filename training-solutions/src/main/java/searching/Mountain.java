package searching;

import java.util.Arrays;

public class Mountain {
    private final int[] heights;

    public Mountain(int[] heights) {
        this.heights = heights;
    }

    public int[] getHeights() {
        return heights;
    }

    public boolean searchPike(Pike pike) {
        return Arrays.binarySearch(heights, pike.getHeight()) >= 0;
    }
}