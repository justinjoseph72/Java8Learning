package stringArrays;

import java.util.*;

/**
 * Created by Justin on 24/04/2017.
 */
public class ArraysAndString {

    /**
     * for asscii charecters the maximum charecters are 128 and
     * for unicode its 256
     *
     * @param word
     * @return
     */
    public boolean isStringMadeofAllUniqueChars(String word) {
        if (word.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < word.length(); i++) {
            int val = word.charAt(i);
            System.out.println(val);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean isStringPermunationOfAnother_Sol1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sortString(str1).equals(sortString(str2));

    }

    public boolean isStringPalidrome(String phrase) {

        boolean myReturn = false;
        int[] table = buildCharFrequencyTable(phrase);
        myReturn = checkMaxOneOdd(table);
        return myReturn;
    }


    public boolean checkforOneChangeAway(String s1, String s2) {
        boolean myReturn = false;
        if (s1.length() == s2.length()) {
            myReturn = checkOneReplaceAway(s1, s2);
        }
        if (s1.length() +1 == s2.length()) {
            myReturn = checkOneInsertAway(s1, s2);
        }
        if (s1.length() -1 == s2.length()) {
            myReturn = checkOneInsertAway(s2, s1);
        }
        return myReturn;
    }

    public String compressGivenString(String str){

        StringBuilder strBuilder = new StringBuilder();
        int counter = 0;
        for(int i = 0; i<str.length();i++){
            if(i+1 <= str.length() && str.charAt(i)!=str.charAt(i+1)){
                strBuilder.append(str.charAt(i));
                strBuilder.append(counter);
                counter = 0;
            }
            else{
                counter ++;
            }
        }
        return  strBuilder.length()<str.length()? strBuilder.toString() : str;
    }
    private boolean checkOneInsertAway(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    private boolean checkOneReplaceAway(String s1, String s2) {
        boolean diffrenceFound = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffrenceFound) {
                    return false;
                }
                diffrenceFound = true;
            }
        }
        return true;
    }

    private boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            System.out.println(c + "  " + x);
            if (x != -1) {
                table[x]++;
            }


        }
        return table;
    }

    /**
     * any non alphabet will be returned -1
     *
     * @param c
     * @return
     */
    private int getCharNumber(char c) {
        int myReturn = -1;
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            myReturn = val - a;
        }
        return myReturn;
    }


    private String sortString(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public void sss(String s){
        Set<String> mySet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

    public boolean isPalindrome1(String phrase){
        char[] charArray = phrase.toCharArray();
        int i =0;
        int l = charArray.length -1;
        while(i<l){
            if(charArray[i]!=charArray[l]){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
}
