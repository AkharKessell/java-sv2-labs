package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    Car car = new Car(5.0, 25.0, 40.0);

    @Test
    void testIncorrectParameterShouldThrowException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Car(5.0, 50.0, 40.0));
        assertEquals("Tank capacity is less than fuel!", ex.getMessage());
    }

    @Test
    void testModifyFuelAmount() {
        car.modifyFuelAmount(-10.0);
        assertEquals(15.0, car.getFuel());
    }

    @Test
    void testDrive() {
        car.drive(100);
        assertEquals(20.0, car.getFuel());
    }

    @Test
    void testNotEnoughFuelShouldThrowException() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> car.drive(600));
        assertEquals("Not enough fuel available!", ex.getMessage());
    }

    @Test
    void testCalculateRefillAmount() {
        assertEquals(15.0, car.calculateRefillAmount());
    }
}