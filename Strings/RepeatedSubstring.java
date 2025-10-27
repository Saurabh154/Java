package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatedSubstring {
    public static void main(String[] args) {
        String s = "abab";

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                arr.add(s.substring(i, j));
            }
        }

        System.out.println(arr);

        HashMap<String, ArrayList<String> > mp = new HashMap<>();

        

    }
}
