package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testGetTodayReferringStudentWithIntParameter() {
        String name = classFiveA.getTodayReferringStudent(3);

        assertEquals("Jane Doe", name);
    }

    @Test
    void testGetTodayReferringStudentWithNumberParameter() {
        String name = classFiveA.getTodayReferringStudent(Number.THREE);

        assertEquals("Jane Doe", name);
    }

    @Test
    void testGetTodayReferringStudentWithStringParameter() {
        String name = classFiveA.getTodayReferringStudent("three");

        assertEquals("Jane Doe", name);
    }
}