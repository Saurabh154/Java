package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {

        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Saurabh");
        users.add("Nitesh");
        users.add("Bob");

        // List<Users> usersList = getFromDatabase(); => real-world

        // Different ways to iterating list

        // 1. For each (Enhanced for loop)
        System.out.println("USING FOR EACH LOOP");
        for (String user : users){
            System.out.println(user);
        }

        // 2. For loop
        System.out.println("USING FOR LOOP");
        for(int i=0; i<users.size(); i++){
            System.out.println(users.get(i));
        }

        // 3. Using Iterator
        System.out.println("USING ITERATOR");
        Iterator<String> it = users.iterator();

        // .hasNext() => check it has next elements exist or not
        // .next()
        while(it.hasNext()){
//            System.out.println(it.next()); // using .next() => fetch the current elements
            if (it.next().equals("Alice")){
                it.remove();
            }
        }

        System.out.println("=====After removing elements====");
        for (String user : users){
            System.out.println(user);
        }
    }
}
