
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PlayerTest {

    Player p1 = new Player("Bob", new Cup(2), new Board());
    Player p2 = new Player("Henris", new Cup(2), new Board());

    @Test
    public void creation(){
        assertNotNull(p1);
        assertNotNull(p2);
    }

    @Test
    public void montant(){
        assertEquals(1500, p1.getNetWorth());
        assertNotEquals(1666, p2.getNetWorth());
    }

    @Test
    public void modifierMontant(){
        p1.addCash(300);
        p2.reduceCash(200);

        assertEquals(1800, p1.getNetWorth());
        assertEquals(1300, p2.getNetWorth());
    }
}
