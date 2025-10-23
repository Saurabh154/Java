package Oops.CallToSuper;

class A {
    A() {
        System.out.println("Parent constructor called");
    }

    void m1() {
        System.out.println("M1 in A");
    }
}

public class Test1 extends A {

    Test1() {
        super();  // 👈 calls parent constructor first (optional but must be first line)
        System.out.println("Child constructor called");
    }

    @Override
    void m1() {
        super.m1();  // 👈 calls parent class m1()
        System.out.println("M1 in Test1 (child)");
    }

    void m2() {
        System.out.println("M2 in Test1");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.m1();
    }
}
