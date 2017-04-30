package linkedLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

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
}
