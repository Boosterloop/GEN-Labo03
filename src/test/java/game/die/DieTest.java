package game.die;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class DieTest {

    @RepeatedTest(20)
    void rollShouldGenerateValueBetween1and6(){
        Die die = new Die();
        die.roll();
        assertTrue(die.getFaceValue() >= 1);
        assertTrue(die.getFaceValue() <= 6);
    }

   /* @Test
    void allValuesShouldBeGenerated() {
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);

        game.game.game.die.Die game.game.game.die = new game.game.game.die.Die();

        while(!values.isEmpty()){
            game.game.game.die.roll();
            values.remove((Integer)game.game.game.die.getFaceValue());
        }

    }*/

    @Test
    void valueShouldBeValidAfterConstructor(){
        Die d = new Die();
        assertTrue(d.getFaceValue() >= 1);
        assertTrue(d.getFaceValue() <= 6);
    }

}
