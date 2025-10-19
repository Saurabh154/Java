package Collections.QuestionsPracticeOnHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapProblem {

    static void manipulationOverHashmap(){
        Scanner sc = new Scanner(System.in);
//        int roll;
//        String name;
        HashMap<Integer, String> map = new HashMap<>();
//
//        System.out.println("Enter number of students : ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter roll and name of the student");
//        for(int i=0; i<n; i++){
//            roll = sc.nextInt();
//            name = sc.nextLine();
//            map.put(roll, name);
//        }

        map.put(100, "Saurabh");
        map.put(101, "Sagar");
        map.put(102, "Shubham");
        map.put(103, "Raju");
        map.put(104, "Rahul");

        System.out.println("==All Students==");
        for(Map.Entry<Integer, String>entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.get(100));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Rahul"));

        System.out.println("Keys in the map:");
        for(Integer key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("Values in the map:");
        for(String value : map.values()){
            System.out.println(value);
        }
    }

    static void FrequencyOfCharacter(){

        String s = "SaurabhKumarVishwakarma";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch, 1);
            }
        }
//        for(int i=0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0)+1);
//        }
        System.out.println("Character : Count");
        for(Map.Entry<Character, Integer>entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    static void countWordInString(){
        String str = "java is java mern is mern";

        // Split string into words
        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

//        for(String word : words){
//            map.put(word, map.getOrDefault(word, 0)+1);
//        }

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer>entry : map.entrySet()){
            System.out.println("Word : " + entry.getKey() + " , " + "Count : " + entry.getValue());
        }


    }

    public static void main(String[] args) {

//        manipulationOverHashmap();
//        FrequencyOfCharacter();
        countWordInString();

    }
}
