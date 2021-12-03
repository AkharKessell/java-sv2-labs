package methodparam.marriage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ManTest {
    Man man;

    @BeforeEach
    void init() {
        man = new Man("John Doe");
    }

    @Test
    void testGetSetName() {
        man.setName("Dr. " + man.getName());
        assertEquals("Dr. John Doe", man.getName());
    }

    @Test
    void testAddGetRegisterDates() {
        man.addRegisterDate(new RegisterDate("születés ideje", LocalDate.parse("1985-08-15")));
        man.addRegisterDate(new RegisterDate("házasságkötés ideje", LocalDate.parse("2021-12-03")));
        assertEquals(2, man.getRegisterDates().size());
        assertEquals("házasságkötés ideje", man.getRegisterDates().get(1).getDescription());
        assertEquals("2021-12-03", man.getRegisterDates().get(1).getDate().toString());
    }

    @Test
    void testCreateManInvalidName() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new Man("  Jake "));
        assertEquals("Name is invalid.", err.getMessage());
    }
}