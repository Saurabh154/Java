package Oops.Constructor;

class InnerB {
    int i, j;

    InnerB() {
        System.out.println("Constructor");
    }

    InnerB(int a, int b) {
        this(10, 20, 30);
        i = a;
        j = b;
        System.out.println("Parametrized constructor");
    }
    InnerB(int a, int b, int c) {
        // i = a;
        // j = b;
        this();
        System.out.println("Parametrized constructor 2");
    }

}

public class B {
    public static void main(String[] args) {
        InnerB b1 = new InnerB();
        // new InnerB(b1);
        System.out.println(b1.i);
        System.out.println(b1.j);
    }
}


