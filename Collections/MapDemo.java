package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();

        //Map<K,V>
        // Key : duplicate not allowed
        // value : allowed duplicates
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Alice");
        userMap.put(4, "Bob");

        System.out.println("User with id 1 : " + userMap.get(1));
        System.out.println("User with id 2 : " + userMap.get(2));
        System.out.println("User with id 3 : " + userMap.get(3));
        System.out.println("User with id 4 : " + userMap.get(4));

        System.out.println("===All Users===");
        for (Map.Entry<Integer, String> entry : userMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(userMap.containsKey(1));
        System.out.println(userMap.containsValue("Alice"));

        System.out.println("Keys in the map:");
        for(Integer key : userMap.keySet()){
            System.out.println(key);
        }

        System.out.println("Values in the map:");
        for(String value : userMap.values()){
            System.out.println(value);
        }


        System.out.println("Practice over HashMap");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(121, "Saurabh");
        map.put(122 ,"Sagar");
        map.put(125, "john");


        for(Integer roll : map.keySet()){
            System.out.println(roll);
        }

        for(String name : map.values()){
            System.out.println(name);
        }

        System.out.println(map.get(121));
        System.out.println(map.get(125));


        System.out.println(map.containsValue("John"));
        System.out.println(map.containsValue("Sagar"));


        // travering over hashMap
        for(Map.Entry<Integer, String>entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }



    }
}
