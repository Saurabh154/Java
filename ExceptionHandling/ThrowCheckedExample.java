package ExceptionHandling;

//Example — Throwing Checked Exception
//Checked exceptions must be declared with throws in the method signature
public class ThrowCheckedExample {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You are under 18");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

//🧠 Since Exception is a checked exception, we declared it using throws in the method.