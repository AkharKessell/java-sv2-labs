package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayInMonthTest {

    DayInMonth dayInMonth = new DayInMonth();

    @Test
    void test2020Ly() {
        assertEquals(29, dayInMonth.daysInMonth(2020, "Február"));
    }

    @Test
    void testM1600Ly() {
        assertEquals(29, dayInMonth.daysInMonth(1600, "Február"));
    }

    @Test
    void testM021Nly() {
        assertEquals(28, dayInMonth.daysInMonth(2021, "február"));
    }

    @Test
    void testM30D() {
        assertEquals(30, dayInMonth.daysInMonth(2021, "szeptember"));
    }

    @Test
    void testM31D() {
        assertEquals(31, dayInMonth.daysInMonth(2021, "Január"));
    }

    @Test
    void testMWrongM() {
        assertEquals(0, dayInMonth.daysInMonth(2021, "fail"));
    }
}