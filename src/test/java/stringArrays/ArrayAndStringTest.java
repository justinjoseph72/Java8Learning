package stringArrays;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Justin on 24/04/2017.
 */
public class ArrayAndStringTest {

    @Test
    @Ignore
    public void testIsUnique(){
      ArraysAndString obj = new ArraysAndString();
      boolean result = obj.isStringMadeofAllUniqueChars("justin");
      assertTrue(result);
    }

    @Test
    @Ignore
    public  void testIsPalidrome(){
        ArraysAndString obj = new ArraysAndString();
        boolean result = obj.isStringPalidrome("tact coa");
        assertTrue(result);
    }

    @Test
    public void testIsOneEditAway()
    {
        ArraysAndString obj = new ArraysAndString();
        boolean result = obj.checkforOneChangeAway("bailo","bailp");
        assertTrue(result);
    }

}
