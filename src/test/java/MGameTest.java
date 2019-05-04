import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
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
            fail("MGame throws an unexpected exception");
        }
    }
       /* List<String> players = new ArrayList<String>();
        players.add("joueur1");
        for (int i = 2; i < 8; i++) {
            try {
                players.add("joueur" + i);
                new MGame(players.toArray(new String[]{}));
            } catch (Exception e) {
                fail(" MGame throw an unexpected exception");
            }
        }

        try {
            new MGame(new String[]{"joueur1"});
            fail("only 1 player");
        }
         catch(Exception e){
            assertTrue(true);
        }
        try{
            new MGame(new String[]{"joueur1","joueur2","joueur3","joueur4","joueur5","joueur6","joueur7","joueur8","joueur9"});
            fail("too mush players(9)");
        }
        catch(Exception e){
            assertTrue(true);
        }
    }*/

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
