package generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestGenerics {

    @Test
    public void testBox(){
        Box<Number> boxNumber = new Box<Number>();
        Box<Integer> intBox = new Box<>();
        boxNumber.add(new Integer(2));
        boxNumber.add(new Double(3.0));
        test_method(boxNumber);
        //test_method(intBox);  this will give compliation error
        test_method2();
        test_method3(new Integer(3));
        test_method3(new Box<Number>());
        test_method3(new Box());

        test_method3(new Object());
       // processString(Collections.emptyList());
        Assert.assertTrue(true);
    }

    private void test_method(Box<Number> box){

        System.out.println(box.getClass().getName());
    }

    private <T> void test_method2(){
        System.out.println("No type");
    }

    private <T> void test_method3(T a){
        System.out.println(" type "+a.getClass().getName());
        if(a instanceof Box){
            System.out.println(" Raw type ");  // works for both raw type and generic type
        }

    }

    @Test
    public void processString(){
        System.out.println("process strings");
        List<Number> mumList = new ArrayList<>();

        mumList.add(new Integer(32));
        mumList.add(new Float(3.3));
        mumList.forEach(s-> System.out.println(s.getClass().getName()));
        List<? extends Number> newLIst;
        newLIst = new ArrayList<Integer>();

        List<? extends Number> wildCardList = new ArrayList<>() ;


        List<Integer> new_intList = new ArrayList<>();
        List<Double> new_DoubleList = new ArrayList<>();
        wildCardList = new_intList;
        wildCardList = new_DoubleList;

    }


    private void checkGemericparam(List<Number> numList){
        System.out.println(numList.size());
        int u =numList.get(0).intValue() + 1;
    }

    private void checWildCardParams(List<? extends Number> numList){
        System.out.println(numList.size());
        int u =numList.get(0).intValue() + 1;
    }

    private <T> void clearGenericList(List<T> myLIst){
       // myLIst.clear();  //this will throw unsupported exception
        //myLIst.equals("(tring"); //this will throw unsupported exception
        for (Object elem: myLIst)
            System.out.print(elem + " ");
        System.out.println();

    }

    private  void clearWildCardList(List<?> myLIst){

        for (Object elem: myLIst)
            System.out.print(elem + " ");
        System.out.println();
         //myLIst.clear();  //this will throw unsupported exception
        //myLIst.equals("(tring"); //this will throw unsupported exception
    }


    @Test
    public void test_method5(){
        List<Integer> intList = Arrays.asList(1,2,3);
      //  checkGemericparam(intList); // this throws a compilation error

     //   checkGemericparam(new ArrayList()); //this works but can give runtime exception;
        List myList = Arrays.asList("s");
       // checkGemericparam(myList);//this does not give compilation error but will give runtime erroror runtime error
                                  //when it tries to access string as number
        checWildCardParams(intList);  //this work
        checWildCardParams(myList); //this works but can give runtime exception
    }

    @Test
    public void test_method6(){
        List<Integer> intList = Arrays.asList(1,2,3);
       // clearGenericList(intList);
        clearWildCardList(intList);

    }


}
