package game;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.*;

public class MGameTest {

    // Help to do this test :
    // https://www.baeldung.com/parameterized-tests-junit-5
    // https://stackoverflow.com/questions/46931267/how-to-parameterize-with-string-arrays-in-junit-5
    static Stream<Arguments> stringArrayProvider() {
        return Stream.of(
                Arguments.of((Object) new String[]{"J1", "J2"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3", "J4"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3", "J4", "J5"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3", "J4", "J5", "J6"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3", "J4", "J5", "J6", "J7"}),
                Arguments.of((Object) new String[]{"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8"})
        );
    }

    @ParameterizedTest
    @MethodSource("stringArrayProvider")
    public void itShouldWorkBetween2and8Players(String[] players) {
        try {
            new MGame(players);
        } catch (Exception e) {
            fail("game.MGame throws an unexpected exception");
        }
    }

    @Test
    public void GameSouldThrowExceptionIfNotEnoughPlayers() {
        try {
            new MGame(new String[]{"joueur1"});
            fail("only 1 player");
        }
        catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void GameSouldThrowExceptionIfTooManyPlayers() {
        try {
            new MGame(new String[]{"J1", "J2", "J3", "J4", "J5", "J6", "J7", "J8", "J9"});
            fail("Too many players in game");
        }
        catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void playGameShouldWork(){
        try{
            MGame game = new MGame(new String[]{"joueur1","joueur2"});
            game.playGame();
        }
        catch(Exception e) {
            fail("playGame throw an unexpected exception");
        }
    }
}
