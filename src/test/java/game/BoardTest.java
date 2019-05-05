package game;

import game.Board;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import game.square.Square;

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

    @Test
    void getSquareOldPositionPlusValue() {
        Square squarePos36 = b.getSquares().get(35);
        Square squarePos3 = b.getSquares().get(2);
        assertEquals(b.getSquare(squarePos36, 7), squarePos3);
    }

}
