package Oops.CallToSuper;

class P {
    int x = 10;
}

class Q extends P {
    int x = 20;
    void show() {
        System.out.println(x);        // prints 20 (child)
        System.out.println(super.x);  // prints 10 (parent)
    }
}

public class Test {
    public static void main(String[] args) {
        new Q().show();
    }
}
