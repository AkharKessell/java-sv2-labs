package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    static final double SAMPLE_MASS = 70;
    static final double SAMPLE_HEIGHT = 1.7;
    static final double SAMPLE_MASS_UNDER = 60;
    static final double SAMPLE_HEIGHT_UNDER = 1.9;
    static final double SAMPLE_MASS_OVER = 90;
    static final double SAMPLE_HEIGHT_OVER = 1.6;

    @Test
    void testCreate() {
        BodyMass bodyMass = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);

        assertEquals(SAMPLE_MASS, bodyMass.getWeight());
        assertEquals(SAMPLE_HEIGHT, bodyMass.getHeight());
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass bodyMass = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);

        double expectedBmi = SAMPLE_MASS / (SAMPLE_HEIGHT * SAMPLE_HEIGHT);
        assertEquals(expectedBmi, bodyMass.getBodyMassIndex());
    }

    @Test
    void testGetBody() {
        BodyMass bodyMass = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);
        BodyMass bodyMassUnder = new BodyMass(SAMPLE_MASS_UNDER, SAMPLE_HEIGHT_UNDER);
        BodyMass bodyMassOver = new BodyMass(SAMPLE_MASS_OVER, SAMPLE_HEIGHT_OVER);

        assertEquals(BmiCategory.NORMAL, bodyMass.getBody());
        assertEquals(BmiCategory.UNDERWEIGHT, bodyMassUnder.getBody());
        assertEquals(BmiCategory.OVERWEIGHT, bodyMassOver.getBody());
    }

    @Test
    void testIsThinnerThan() {
        BodyMass bodyMass = new BodyMass(SAMPLE_MASS, SAMPLE_HEIGHT);
        BodyMass bodyMassUnder = new BodyMass(SAMPLE_MASS_UNDER, SAMPLE_HEIGHT_UNDER);

        assertFalse(bodyMass.isThinnerThan(bodyMassUnder));
        assertTrue(bodyMassUnder.isThinnerThan(bodyMass));
        assertFalse(bodyMass.isThinnerThan(bodyMass));
    }
}