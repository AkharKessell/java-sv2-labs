package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RegisterDateTest {
    @Test
    void testCreateRegisterDate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.parse("1985-08-15"));
        assertEquals("születés ideje", registerDate.getDescription());
        assertEquals(LocalDate.of(1985, 8, 15), registerDate.getDate());
    }

    @Test
    void testCreateRegisterDateInvalidDescription() {
        LocalDate date = LocalDate.parse("1985-08-15");
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new RegisterDate(" ", date));
        assertEquals("Description must not be empty.", err.getMessage());
    }

    @Test
    void testCreateRegisterDateInvalidDate() {
        LocalDate date = LocalDate.parse("3983-12-03");
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> new RegisterDate("születés ideje", date));
        assertEquals("Date is invalid.", err.getMessage());
    }
}