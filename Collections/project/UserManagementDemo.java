package Collections.project;

import java.lang.reflect.Array;
import java.util.*;

public class UserManagementDemo {
    public static void main(String[] args) {

        Set<String> user1Roles = new HashSet<>(Arrays.asList("ADMIN", "USER"));
        User user1 = new User("Alice", true, user1Roles);

        List<User> users = new ArrayList<>();

        users.add(user1);

        Set<String> user2Roles = new HashSet<>(Arrays.asList("MANAGER"));
        User user2 = new User("Saurabh", false, user2Roles);
        users.add(user2);

        Set<String> user3Roles = new HashSet<>(Arrays.asList("MANAGER", "ADMIN", "USER"));
        User user3 = new User("Rajat", true, user3Roles);
        users.add(user3);

        // Another way
        users.add(new User("Bob", false,
                new HashSet<>(Arrays.asList("USER","ADMIN"))));

        users.add(new User("Smith", true,
                new HashSet<>(Arrays.asList("USER"))));

        users.add(new User("Bob", false,
                new HashSet<>(Arrays.asList("USER","MANAGER"))));

        users.add(new User("Blake", true,
                new HashSet<>(Arrays.asList("LEAD","MANAGER"))));


        // REMOVE INACTIVE USER
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().isActive()){
                iterator.remove();
            }
        }

        // PRINT ACTIVE USER
        System.out.println("1. ACTIVE USERS");
        for(User user : users){
            System.out.println(user.getName());
        }

        // COUNT USERS PER ROLE
        System.out.println("2. COUNT USERS PER ROLE");
        Map<String, Integer> roleCount = new HashMap<>();
        // MANAGER : 1
        // ADMIN : 1


        //Har user ke role ke through iterate karenge aur count karenge
        for(User user : users){
            for(String role : user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0)+1);
            }
        }

        System.out.println("All Users : Count");
        for(Map.Entry<String,Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
