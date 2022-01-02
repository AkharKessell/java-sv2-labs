package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TypeWriterStateTest {
    @Test
    void testChangeState() {
        assertEquals(TypeWriterState.UPPERCASE, TypeWriterState.LOWERCASE.changeCase());
        assertEquals(TypeWriterState.LOWERCASE, TypeWriterState.UPPERCASE.changeCase());
    }
}