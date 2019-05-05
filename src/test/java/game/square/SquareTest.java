package game.square;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @ParameterizedTest
    @ValueSource(strings = {"Case 2", "Case 3", "Case 4"})
    void aSquareHasToHaveAName(String name) {
        Square s = new RegularSquare(name);
        assertEquals(s.getName(), name);
    }
}
