package recurssion;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Justin on 29/05/2017.
 */
public class MagicIndexTest {

    @Test
    public void testMagicIndex(){
        MagicIndex mi = new MagicIndex();
        int[] array = new int[] {-40,-20,-10,0,4};
        int magicIndex = mi.getMagicIndex(array);
        assertEquals(4,magicIndex);
    }
}
