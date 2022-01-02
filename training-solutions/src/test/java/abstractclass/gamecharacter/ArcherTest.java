package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class ArcherTest {
    @Test
    void testCreation() {
        Random random = new Random(100);
        Character character = new Archer(new Point(5, 10), 100);

        assertEquals(100, character.getHitPoint());
        assertTrue(character.isAlive());
        assertEquals(5L, character.getPosition().getxPos());
        assertEquals(10L, character.getPosition().getyPos());
    }

    @Test
    void testAttack() {
        Random random = new Random(100);
        Archer offender = new Archer(new Point(0, 0), 100);
        Character defender = new Archer(new Point(12, 0), 100);
        while (defender.getHitPoint() > 0) {
            offender.secondaryAttack(defender);
        }
        assertTrue(defender.getHitPoint() <= 0);
        assertFalse(defender.isAlive());
    }

    @Test
    void testSecondaryAttack() throws Exception {
        Random random = new Random(100);
        Archer offender = new Archer(new Point(0, 0), 100);
        Character defender = new Archer(new Point(12, 0), 100);
        offender.secondaryAttack(defender);

        assertEquals(100, offender.getHitPoint());
        assertTrue(defender.getHitPoint() >= 96);
        assertEquals(99, offender.getNumberOfArrow());
    }
}
