package Collections;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {
    public static void main(String[] args) {

        //Set ka ek implementation hai Hashset
        // unordered set, where duplicates are not allowed
        // cannot access by index due to unordered
        Set<String> roles = new HashSet<>();

        roles.add("ADMIN");
        roles.add("MANAGER");
        roles.add("USER");

        for(String role : roles){
            System.out.println("ROLE : " + role);
        }
    }
}
