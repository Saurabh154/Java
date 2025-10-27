package Oops.Upcasting;

class A{
    void m1(){
        System.out.println("M1 in A");
    }
}
class B extends A{
    void m2(){
        System.out.println("M2 in B");
    }
}

public class Test1 {
    public static void main(String[] args) {
//        B b1 = new B();
//        b1.m1();
//        b1.m2();



        A a1 = new B();
        a1.m1();
//        a1.m1();
//        a1.m2();
    }
}
