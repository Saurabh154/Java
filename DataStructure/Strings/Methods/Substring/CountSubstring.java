package DataStructure.Strings.Methods.Substring;

import java.util.ArrayList;
import java.util.List;

public class CountSubstring {

    static int maxLengthSubstring(String str){
        //int start = 0; not need



        int end = 0;
        int maxLength = 0;

        List<Character> list = new ArrayList<>();
        while(end < str.length()){
            char ch = str.charAt(end);
            if(list.contains(ch)){
                list.remove(Character.valueOf(ch));
                //start++; not need for two pointers single pointer with single traversal will work
            }
            else{
                list.add(ch);
                maxLength = Math.max(maxLength, list.size());
                end++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        // op: 3
        String s = "abcabcbbacdefbacd";

        //abc-3 bca-3 cab-3 a-1 ab-2 abc-3 abca-x

        System.out.println("Maximum length : " + maxLengthSubstring(s));

    }
}
