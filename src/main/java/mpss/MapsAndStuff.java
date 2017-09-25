package mpss;

import java.util.*;

public class MapsAndStuff {

    public Map<Integer,String>   one(){
        Map<Integer,String> mps = new HashMap<>();
        mps.put(null,"Saumya");
        mps.put(1,"Justin");
        mps.put(2,"Robin");
        mps.put(null,"Taht");
        return  mps;

    }

    public List<Integer> getLists(){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        System.out.println(myList.size());
        myList.add(null);
        myList.add(null);
        myList.add(null);
        System.out.println(myList.size());
        return myList;
    }

    public Hashtable<Integer,String> hashtablese(){
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(1,"Saumya");
        table.put(2,"Justin");
        table.put(3,"Raobin");

        return table;
    }
}
