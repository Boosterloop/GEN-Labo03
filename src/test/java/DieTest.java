import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;


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

        Die die = new Die();

        while(!values.isEmpty()){
            die.roll();
            values.remove((Integer)die.getFaceValue());
        }

    }*/

    @Test
    void valueShouldBeValidAfterConstructor(){
        Die d = new Die();
        assertTrue(d.getFaceValue() >= 1);
        assertTrue(d.getFaceValue() <= 6);
    }

}
