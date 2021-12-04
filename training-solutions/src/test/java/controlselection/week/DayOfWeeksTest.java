package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayOfWeeksTest {

    @Test
    void testWhichDay() {
        assertEquals("start of the week", new DayOfWeeks().whichDay("monday"));
        assertEquals("midweek", new DayOfWeeks().whichDay("wednesday"));
        assertEquals("almost weekend", new DayOfWeeks().whichDay("friday"));
        assertEquals("weekend", new DayOfWeeks().whichDay("sunday"));
    }

    @Test
    void testCase() {
        assertEquals("start of the week", new DayOfWeeks().whichDay("mOndAy"));
    }

    @Test
    void testIllegalDay() {
        assertEquals("unknown day", new DayOfWeeks().whichDay("aaa"));
    }
}