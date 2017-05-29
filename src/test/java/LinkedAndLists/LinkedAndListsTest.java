package LinkedAndLists;

import linkedLists.LinkedAndLists;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Justin on 30/04/2017.
 */
public class LinkedAndListsTest {
    private LinkedAndLists obj ;

    @Test
    public void Test_RemoveDup1(){
        LinkedAndLists obj = new LinkedAndLists();
        LinkedList<String> myList = new LinkedList<>();
        myList.add("jusitn");
        myList.add("justin");
        myList.add("saumya");
        myList.add("robin");
        myList.add("jusitn");

        LinkedList<String> newList = obj.removeDuplicatesFromLinkedList(myList);


        assertNotNull(myList);
        assertEquals(myList.size()-1,newList.size());

    }

    @Test
    public void Test_RemoveDup2(){
        LinkedAndLists obj = new LinkedAndLists();
        LinkedList<String> myList = new LinkedList<>();
        myList.add("jusitn");
        myList.add("justin");
        myList.add("saumya");
        myList.add("robin");
        myList.add("jusitn");

        LinkedList<String> newList = obj.removeDuplicates_better(myList);

        assertNotNull(myList);
        assertEquals(myList.size()-1,newList.size());
    }

    @Test
    public void Test_sumofList(){
        LinkedList<Integer> a = new LinkedList<>();
        a.add(4);a.add(1);a.add(9);
        LinkedList<Integer> b = new LinkedList<>();
        b.add(5);b.add(2);b.add(1);
        LinkedAndLists obj = new LinkedAndLists();
        LinkedList<Integer> c = obj.SumOfLIsts(a,b);
        assertEquals(0,c.get(0).intValue());
        assertEquals(4,c.get(1).intValue());
        assertEquals(9,c.get(2).intValue());
    }

    @Test
    public void Test_list_palidrome(){
        LinkedAndLists obj = new LinkedAndLists();
        LinkedList<Integer> a = new LinkedList<>();
        a.add(4);a.add(1);a.add(1);a.add(4);
        boolean result = obj.checkPalindrome(a);
        assertEquals(true,result);
    }

    @Test
    public void Test_list_intersection(){
        LinkedList<Integer> list1 = new LinkedList<>() ;
        LinkedList<Integer> list2 = new LinkedList<>() ;
        list1.add(1);;list1.add(2);;list1.add(2);;list1.add(3);;list1.add(3);
        list2.add(4);list2.add(5);list2.add(2); list2.add(3);
    }


    public void Setup(){

    }



}
