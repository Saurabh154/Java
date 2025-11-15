package DataStructure.Strings.InterviewProblem;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

        int [] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
       HashMap<Character, Integer> map = new HashMap<>();
       map.put('I', 1);
       map.put('V', 5);
       map.put('X', 10);
       map.put('L', 50);
       map.put('C', 100);
       map.put('D', 500);
       map.put('M', 1000);
       String s = "LVIII";

       int num = map.get(s.charAt(s.length()-1)); // Last index
       int n = s.length();
       for(int i=n-2; i>=0; i--){
           if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
               num -= map.get(s.charAt(i));
           }else{
               num += map.get(s.charAt(i));
           }
       }

        System.out.println(num);



    }
}
