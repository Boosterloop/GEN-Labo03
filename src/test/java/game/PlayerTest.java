package game;

import game.Board;
import game.Player;
import game.die.Cup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {
    private static Player p1;
    private static Player p2;

    /* Two new players before each tests */
    @BeforeEach
    void createTwoPlayers() {
        p1 = new Player("Bob", new Cup(2), new Board());
        p2 = new Player("Henris", new Cup(2), new Board());
    }

    @Test
    public void constructorWorks(){
        assertNotNull(p1);
        assertNotNull(p2);
    }

    @Test
    public void cashAtTheBeginningIs1500(){
        assertEquals(1500, p1.getNetWorth());
        assertNotEquals(1666, p2.getNetWorth());
    }

    @Test
    public void addCashSouldWork(){
        p1.addCash(300);
        p2.addCash(200);

        assertEquals(1800, p1.getNetWorth());
        assertEquals(1700, p2.getNetWorth());
    }

    @Test
    public void reduceCashSouldWork(){
        p1.reduceCash(300);
        p2.reduceCash(200);

        assertEquals(1200, p1.getNetWorth());
        assertEquals(1300, p2.getNetWorth());
    }
}
