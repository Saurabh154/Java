/*
[DAY 4] Java Collection - PROJECT

Build a system that:
 # Fetches users from a database - [Hard code]
 # Each user has roles(unique)

We want to:
 # Remove inactive users
 # List all active users
 # Count users per role
*/

package Collections.project;

import java.util.Set;

public class User {

    private String name;
    private boolean active;
    private Set<String> roles;

    public User(String name, boolean active, Set<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }
}





