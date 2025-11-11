package DataStructure.Strings;

import java.util.HashMap;

public class WordPattern {

    static boolean solve(String pattern, String word){

        String [] arr = word.split(" ");
        if(pattern.length() != arr.length) return false;

        HashMap<Character, String>map = new HashMap<>();
        for(int i=0; i< pattern.length(); i++){

            char ch = pattern.charAt(i);//            map.put(ch, map.getOrDefault(ch, Character[i])+1);

        }

        return false;
    }

    public static void main(String[] args) {

        String pattern = "abba";
        String word = "cat dog dog cat";

        if(solve(pattern, word)){
            System.out.println("Pattern matching with word");
        }else{
            System.out.println("Pattern does not matching with word");
        }
    }
}
