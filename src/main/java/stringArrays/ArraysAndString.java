package stringArrays;

import java.util.Arrays;

/**
 * Created by Justin on 24/04/2017.
 */
public class ArraysAndString {

    /**
     * for asscii charecters the maximum charecters are 128 and
     * for unicode its 256
     * @param word
     * @return
     */
    public boolean isStringMadeofAllUniqueChars(String word){
        if(word.length()>128){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i=0;i< word.length();i++){
            int val = word.charAt(i);
            System.out.println(val);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean isStringPermunationOfAnother_Sol1(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        return sortString(str1).equals(sortString(str2));

    }

    private String sortString(String str){
        char [] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
