package ExceptionHandling.CustomException;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class UserValidation {
    void validateUser(String name, int age) throws InvalidAgeException, NullPointerException {
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("User is valid!");
    }
}
public class Main {
    public static void main(String[] args) {
        UserValidation uv = new UserValidation();

        try {
            uv.validateUser(null, 16);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Exception: " + e.getMessage());
        }
    }
}


/*
🧠 Here:

# validateUser() declares two possible exceptions
   @ InvalidAgeException (custom checked exception)
   @ NullPointerException (unchecked exception)

# main() handles both.

*/