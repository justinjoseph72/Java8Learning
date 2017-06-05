package recurssion;

import java.util.ArrayList;

/**
 * Created by Justin on 30/05/2017.
 */
public class PwerSet {

    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
        ArrayList<ArrayList<Integer>> allSubset = null;
        if(set.size() == index){
            allSubset = new ArrayList<>();
            allSubset.add(new ArrayList<Integer>());
        }
        else{
            allSubset = getSubsets(set, index +1);
            ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<>();
            int item  = set.get(index);
            for(ArrayList<Integer> subsets : allSubset){
                ArrayList<Integer> newsubset = new ArrayList<>();
                newsubset.addAll(subsets);
                newsubset.add(item);
                moreSubset.add(newsubset);
            }
            allSubset.addAll(moreSubset);
        }
        return allSubset;
    }
}
