package game;

import game.square.*;
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
    void firstSquareOfBoardShouldBeAGoSquare() {
        assertEquals(b.getSquares().getFirst().getClass(), GoSquare.class);
    }

    @Test
    void boardShouldHaveAGoToJailSquare() {
        assertEquals(b.getSquares().get(30).getClass(), GoToJailSquare.class);
    }

    @Test
    void boardShouldHaveTwoIncomeTaxSquares() {
        assertEquals(b.getSquares().get(4).getClass(), IncomeTaxSquare.class);
        assertEquals(b.getSquares().get(38).getClass(), IncomeTaxSquare.class);
    }

    @Test
    void getSquareOldPositionPlusValue() {
        Square squarePos36 = b.getSquares().get(35);
        Square squarePos3 = b.getSquares().get(2);
        assertEquals(b.getSquare(squarePos36, 7), squarePos3);
    }

}
