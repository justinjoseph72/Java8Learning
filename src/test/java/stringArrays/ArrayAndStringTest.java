package stringArrays;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void splits(){
        List<String> myList = new ArrayList<>();
        int nuoOfToken = 0;
        String str = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        String[] aplits = str.split("[ !,?._'@]+");
        System.out.println(aplits.length);
        for(String s : aplits){
            System.out.println(s);
        }
    }

}
