package mps;

import mpss.MapsAndStuff;
import mpss.StaticTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class MapsTESt {

    @Test
    public void test1(){
        MapsAndStuff obj = new MapsAndStuff();
        Map<Integer,String>  mps = obj.one();
        mps.entrySet().forEach(e->{
            System.out.print("Key is " + e.getKey());
            System.out.println("VAlue is  is " + e.getValue());
        });
    }

    @Test
    public void test2(){
        MapsAndStuff obj = new MapsAndStuff();
        List<Integer> myList = obj.getLists();
        myList.forEach(s->{
            System.out.println(s);
        });

        int indexFlag=0;
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            indexFlag++;
            if(indexFlag==2)
            {
                it.remove();
            }
            System.out.println(it.next());
        }
    }

    @Test
    public void test3(){
        MapsAndStuff obj = new MapsAndStuff();
        Hashtable<Integer,String > table = obj.hashtablese();
        Enumeration<String> e = table.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }


    @Test
    public void ss(){
        StaticTest st = new StaticTest("Justin",1);
        st.disp();
        st.setStudentname("Robin");
        st.disp();
        st = new StaticTest(8);
        st.disp();

    }
}
