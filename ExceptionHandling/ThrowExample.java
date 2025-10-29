package ExceptionHandling;


// Example 1 — Throwing Unchecked Exception
public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;
        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote...");
        }
    }
}
