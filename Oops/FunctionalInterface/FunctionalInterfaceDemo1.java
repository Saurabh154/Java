package Oops.FunctionalInterface;

@FunctionalInterface
interface Action{
    void performAction();
    int hashCode();
}

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        // STEP-1
        Action a = new Action() {
            @Override
            public void performAction() {
                System.out.println("Perform action");
            }
        };
        a.performAction();

        // STEP-2
        Action a1 = () -> {
            System.out.println("Called");
        };
        a1.performAction();

        // STEP-3
        Action a2 = () -> System.out.println("Performed");
        a2.performAction();
    }
}
