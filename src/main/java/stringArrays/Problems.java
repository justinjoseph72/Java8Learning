package stringArrays;

import java.util.HashMap;
import java.util.Map;

public class Problems {

    public Map<String,Integer> findDuplicateWordsAndNumberOfOccurances(String inputStr){
        if(inputStr!=null && inputStr.length()>0){
            String[] splits =inputStr.split("\\s");
           if(splits.length >0){
               Map<String,Integer> map = new HashMap<>();

               for(String str: splits){
                   Integer count = map.get(str);
                   if(count==null){
                       count =new Integer(1);
                   }
                   else{
                       count = count + 1;
                   }
                   map.put(str,count);
               }
               return map;
           }
        }
        return null;
    }
}
