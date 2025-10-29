package Oops.Abstraction;

abstract class A{
    A(){
        System.out.println("yeah!!");
    }
    abstract void m1();
}

class Demo extends A {
    Demo(){
        super();
        System.out.println("Constructor for sub class");
    }

    @Override
    void m1(){
        System.out.println("override method");
    }
    public static void main(String[] args) {
        A a = new Demo();
        a.m1();
    }
}
