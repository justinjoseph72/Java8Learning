package recurssion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Justin on 22/05/2017.
 */
public class TestTripleTest {

    @Test
    public void testTipleTest(){
        TripleStep obj = new TripleStep();
        int r = obj.countWays(4);
        assertEquals(7,r);

    }
}
