import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

    @Test
    void getPieceShouldWork8Times() {
        try {
            for (int i = 0; i < 8; i++) {
                b.getPiece();
            }
        }
        catch(Exception e){
            fail("pas assez de pieces");
        }
    }

    @Test
    void getSquareOldPositionPlusValue() {
        Square squarePos36 = b.getSquares().get(35);
        Square squarePos3 = b.getSquares().get(2);
        assertEquals(b.getSquare(squarePos36, 7), squarePos3);
    }

}
