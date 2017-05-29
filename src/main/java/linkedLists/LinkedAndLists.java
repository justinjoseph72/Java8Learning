package linkedLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by Justin on 30/04/2017.
 */
public class LinkedAndLists {

    public LinkedList<String> removeDuplicatesFromLinkedList(LinkedList<String> n){
        Iterator<String> linkedListItr = n.iterator();
        HashSet<String> set = new HashSet<String>();
        while(linkedListItr.hasNext()){
            String  item = linkedListItr.next();
            if(set.contains(item)){
                continue;
            }
            else {
                set.add(item);
            }
        }
        if(!set.isEmpty()){
            return new LinkedList<String>(set);
        }
        else{
            return null;
        }
    }

    public LinkedList<String> removeDuplicates_better(LinkedList<String> n){

        HashSet<String> set = new HashSet<String>(n);
        return new LinkedList<>(set);
    }

    public LinkedList<String> findKtheElementTillLast(LinkedList<String> n,int k){
        LinkedList<String> returnList = null;
        if(k>n.size()){
            return returnList;
        }
        returnList = new LinkedList<>();
        Iterator<String> itr = n.iterator();
        int counter = 0;
        while(itr.hasNext()){
            String element = itr.next();
            if(counter >=k){
                returnList.add(element);
            }
            counter++;
        }
        return returnList;
    }

    public LinkedList<Integer> SumOfLIsts(LinkedList<Integer> a, LinkedList<Integer> b){
        LinkedList<Integer> retrunList = new LinkedList<>();
        Integer carrYValue = 0;
        for(int i = a.size()-1;i>=0;i--){
            Integer sumOfNode = a.get(i) + b.get(i) + carrYValue;
            if(sumOfNode>9){
                Integer tempSum = sumOfNode;
                tempSum = sumOfNode%10;
                carrYValue = sumOfNode/10;
                retrunList.add(tempSum);
            }
            else
            {
                retrunList.add(sumOfNode);
                carrYValue = 0;
            }

        }
        return retrunList;
    }

    public boolean checkPalindrome(LinkedList<Integer> list){
        boolean myReturn = true;
        //reversing
        LinkedList<Integer> reverList = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            reverList.add(list.get(i));
        }
        //comparing
        for(int j= 0;j<list.size();j++){
            if(reverList.get(j) !=list.get(j)){
                return false;
            }
        }

        return myReturn;
    }

    public Integer getIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2){
        Integer myreturn = null;
        if (list1!=null && list2!=null && !list1.isEmpty() && !list2.isEmpty()) {
            if(!list1.get(list1.size()-1).equals(list2.get(list2.size()-1))){
                return null;
            }
            int itersize = 0;
            if(list1.size()== list2.size()){
                itersize = list1.size();
            }
            else{
                itersize = Math.abs(list1.size()-list2.size());
            }
            if(itersize>0){
                for(int i=itersize-1;i<=0;i++){
                    if(list1.get(i)==list2.get(i)){
                        myreturn = list1.get(i);
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return myreturn;
    }


}
