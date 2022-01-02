package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class BattlefieldTest {

    @Test
    void testBattle(){
        Random random = new Random(100);
        Battlefield battlefield = new Battlefield();
        Character archer = new Archer(new Point(0,0),100);
        Character warrior = new AxeWarrior(new Point(5,0));
        battlefield.fight(archer,warrior);
        assertTrue(battlefield.getRound() > 0 );
        assertTrue(!archer.isAlive() || !warrior.isAlive());
    }

    @Test
    void testBattleNear(){
        Random random = new Random(100);
        Battlefield battlefield = new Battlefield();
        Character archer = new Archer(new Point(0,0),100);
        Character warrior = new AxeWarrior(new Point(1,0));
        battlefield.fight(archer,warrior);
        assertTrue(battlefield.getRound() > 0 );
        assertTrue(!archer.isAlive() || !warrior.isAlive());
    }
}
