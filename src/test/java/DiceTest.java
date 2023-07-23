import org.junit.Assert;
import org.junit.Test;

import javax.swing.plaf.basic.BasicBorders;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void getRoll() {
        Dice dice = new Dice(1);
        boolean expected = true;
        boolean actual = false;
        int testVal = dice.getRoll();

        if(testVal>0 && testVal<7) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getRoll1() {
        Dice dice = new Dice(2);
        boolean expected = true;
        boolean actual = false;
        int testVal = dice.getRoll();

        if(testVal>1 && testVal<13) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void tossAndSum() {
        Dice dice = new Dice(2);
        boolean expected = true;
        boolean actual = false;
        int testVal = dice.tossAndSum();

        if(testVal>1 && testVal<13) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void tossAndSum2() {
        Dice dice = new Dice(4);
        boolean expected = true;
        boolean actual = false;
        int testVal = dice.tossAndSum();

        if(testVal>3 && testVal<25) {
            actual = true;
        }

        Assert.assertEquals(expected,actual);
    }
}