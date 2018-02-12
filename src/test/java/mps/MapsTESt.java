package mps;

import mpss.MapsAndStuff;
import mpss.StaticTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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


    @Test
    public void testStream(){
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"Justin");
        map.put(1,"Saumya");
        map.put(2,"Robin");
        map.put(3,"Sardar");


       String joinedStr =  map.keySet().stream()
        .filter(x->x%2==0).map(s->getNames(s,map))
                .collect(Collectors.joining(","));
       System.out.println(joinedStr);

    }

    private String getNames(Integer s, Map<Integer, String> map) {
        return  map.get(s);
    }
}
