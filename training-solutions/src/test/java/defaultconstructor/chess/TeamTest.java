package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TeamTest {

    @Test
    void testCreate() {
        Team team = new Team();

        assertNull(team.getPlayerOne());
        assertNull(team.getPlayerTwo());
    }

    @Test
    void testSetPlayers() {
        Player firstPlayer = new Player();
        firstPlayer.setName("John Doe");
        firstPlayer.setEmail("doej@gmail.com");
        Player secondPlayer = new Player();
        secondPlayer.setName("Joe Doe");
        secondPlayer.setEmail("doejo@gmail.com");
        Team team = new Team();
        team.setPlayerOne(firstPlayer);
        team.setPlayerTwo(secondPlayer);

        assertEquals("John Doe", team.getPlayerOne().getName());
        assertEquals("doejo@gmail.com", team.getPlayerTwo().getEmail());
    }
}