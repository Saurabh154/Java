package ExceptionHandling.Throws;

public class UncheckedThrowsExample {
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;   // May cause ArithmeticException
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        divide(10, 0); // Causes runtime error
        System.out.println("Program ends...");
    }
}

/*

🧠 Explanation:

We declared throws ArithmeticException,
but the compiler didn’t ask us to use try-catch.

The exception still occurs at runtime.

It’s unchecked, so no compile-time error.

Example — Using throws with Multiple Unchecked Exceptions

public class Example2 {
    static void process(String name, int[] arr)
            throws NullPointerException, ArrayIndexOutOfBoundsException {

        System.out.println(name.length()); // may throw NullPointerException
        System.out.println(arr[5]);        // may throw ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {
        process(null, new int[]{1, 2, 3});
    }
}

 */