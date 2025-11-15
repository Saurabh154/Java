package DataStructure.Strings.InterviewProblem;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceWord {
    public static void main(String[] args) {

        String s = "java IS a Program which run program program";

        String [] str = s.toLowerCase().split(" ");

        HashMap<String, Integer>map = new HashMap<>();

//        for(String word : str){
//            map.put(word, map.getOrDefault(word, 0)+1);
//        }

        for(String word : str){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }

        int maxCount = 0;
        String maxWord ="";
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println(maxWord + " -> " + maxCount);


    }
}
