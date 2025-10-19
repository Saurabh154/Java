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

    }
}
