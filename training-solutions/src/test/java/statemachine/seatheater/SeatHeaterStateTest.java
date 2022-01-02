package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatHeaterStateTest {
    @Test
    void testNext() {
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.changeSetting());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWO.changeSetting());
        assertEquals(SeatHeaterState.TWO, SeatHeaterState.THREE.changeSetting());
        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.changeSetting());
    }
}