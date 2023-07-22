import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class BinsTest {

    @Test
    public void getBinTest() {
        Bins results = new Bins(2,12);
        int expected = 0;
        int actual = results.getBin(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinTest2() {
        Bins results = new Bins(2,12);
        int expected = 0;
        int actual = results.getBin(12);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest() {
        Bins results = new Bins(2,12);
        int expected = 1;
        results.incrementBin(10);
        int actual = results.getBin(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest2() {
        Bins results = new Bins(2,12);
        int expected = 2;
        results.incrementBin(12);
        results.incrementBin(12);
        int actual = results.getBin(12);

        Assert.assertEquals(expected, actual);
    }
}
