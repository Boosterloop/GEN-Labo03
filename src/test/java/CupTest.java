

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class CupTest {
    public static Cup cup;

    @BeforeAll
    static public void cupOf2DiceShouldWork(){
        cup = new Cup(2);
    }

    @Test
    public void rollShouldWork(){
        cup.roll();
    }

    @Test
    public void getTotalShouldWork(){
        cup.getTotal();
    }
}
