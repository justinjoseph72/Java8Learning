package interfaces;

import org.junit.Test;

public class TestInteracess {

    @Test
    public void Test_Test_default(){
        TestInterfaceImpl myImpl = new TestInterfaceImpl();
        myImpl.default_method();
        String str = myImpl.static_method();
        System.out.println(str);
    }
}
