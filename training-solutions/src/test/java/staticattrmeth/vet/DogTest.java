package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void testCreate() {
        Dog dog = new Dog("Reaper", 5, Species.GERMAN_SHEPHERD);

        assertEquals("Reaper", dog.getName());
        assertEquals(5, dog.getAge());
        assertEquals(Species.GERMAN_SHEPHERD, dog.getSpecies());
        assertEquals(0L, dog.getCodeNumber());
    }
}