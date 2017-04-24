package stringArrays;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Justin on 24/04/2017.
 */
public class ArrayAndStringTest {

    @Test
    public void testIsUnique(){
      ArraysAndString obj = new ArraysAndString();
      boolean result = obj.isStringMadeofAllUniqueChars("justin");
      assertTrue(result);
    }
}
