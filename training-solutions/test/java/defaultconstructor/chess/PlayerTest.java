package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PlayerTest {

    @Test
    void testCreate() {
        Player player = new Player();

        assertNull(player.getName());
        assertNull(player.getEmail());
    }

    @Test
    void testSetNameAndEmail() {
        Player player = new Player();
        player.setName("John Doe");
        player.setEmail("Doej@gmail.com");

        assertEquals("John Doe", player.getName());
        assertEquals("Doej@gmail.com", player.getEmail());
    }
}