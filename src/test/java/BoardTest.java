import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    private static Board b;

    @BeforeAll
    static void createBoard() {
        b = new Board();
    }

    @Test
    void aBoardShouldHave40Squares() {
        assertEquals(b.getSquares().size(), 40);
    }

    @Test
    void firstSquareOfBoardShouldBeDepart() {
        assertEquals(b.getSquares().getFirst().getName(), "Départ");
    }

}
