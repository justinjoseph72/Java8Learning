package recurssion;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Justin on 16/05/2017.
 */
public class Fibonaccitest {
    @Test
    public void testFibonacciNumber()
    {
        Fibonacci obj = new Fibonacci();
        int result = obj.getFibonacciNumber(4);
        assertEquals(3,result);
    }
}
