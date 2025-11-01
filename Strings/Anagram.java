package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    static boolean checkAnagramUsingMap(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        if(s1.length() != s2.length()) return false;

        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        /*
        * p-1 , e-2, k-1
        *
        * keep
        * */


        for(int i=0 ; i<s2.length(); i++){
            if(!map.containsKey(s2.charAt(i))) return false;

            map.put(s2.charAt(i), map.get(s2.charAt(i))-1);

            if(map.get(s2.charAt(i)) == 0){
                map.remove(s2.charAt(i));
            }

        }

        return map.isEmpty();
    }

    static boolean checkAnagram(String s1, String s2){

        if(s1.length() != s2.length()) return false;

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {


        // s1= peek
        // s2 = keep
//        checkAnagramUsingMap
        if(checkAnagramUsingMap("peek", "keeep")){
            System.out.println("String is an Anagram : ");
        }else{
            System.out.println("String is Not an Anagram : ");
        }


    }
}
