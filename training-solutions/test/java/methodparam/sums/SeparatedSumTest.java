package methodparam.sums;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparatedSumTest {

    @Test
    void testSeparatedSum() throws IOException {
        SeparatedSum separatedSum = new SeparatedSum();

        String contents = separatedSum.readFile();

        PairOfDoubles pairOfDoubles = separatedSum.sum(contents);

        assertEquals(110.6, pairOfDoubles.getSumOfPositiveNumbers(), 1e-5);
        assertEquals(-153.3, pairOfDoubles.getSumOfNegativeNumbers(), 1e-5);
    }
}