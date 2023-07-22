import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    void getRoll() {
        Dice dice = new Dice(1);
        Boolean expected = true;
        Boolean actual = false;
        int testVal = dice.getRoll();

        if(testVal>0 && testVal<7) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    void getRoll1() {
        Dice dice = new Dice(2);
        Boolean expected = true;
        Boolean actual = false;
        int testVal = dice.getRoll();

        if(testVal>1 && testVal<13) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    void tossAndSum() {
        Dice dice = new Dice(2);
        Boolean expected = true;
        Boolean actual = false;
        int testVal = dice.tossAndSum();

        if(testVal>1 && testVal<13) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    void tossAndSum2() {
        Dice dice = new Dice(4);
        Boolean expected = true;
        Boolean actual = false;
        int testVal = dice.tossAndSum();

        if(testVal>3 && testVal<25) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }
}