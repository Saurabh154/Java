package Oops.FunctionalInterface;

@FunctionalInterface
interface BookAction{
    void perform();
    String toString();
    int hashCode();
    boolean equals(Object obj);
}

// Functional Interface with Parameters
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

// Parameter -> expression body
// () -> {}
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // STEP 1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Performed");
            }
        };
        action1.perform();

        // STEP 2
        BookAction action2 = () -> {
            System.out.println("Action Performed");
        };
        action2.perform();

        // STEP 3
        BookAction action3 = () -> System.out.println("Action Performed");
        action3.perform();


        // Functional interface with parameter
        // STEP 1
        Operation operation = new Operation() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(operation.add(10,20));

        // USING LAMBDAS EXPRESSION
        Operation operation1 = (int a, int b) -> {
            return a+b;
        };

        System.out.println(operation1.add(10,20));

        // THREAD INTERFACE
        new Thread(() -> System.out.println("New Thread Created")).start();

    }
}
