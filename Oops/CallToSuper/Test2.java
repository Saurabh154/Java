package Oops.CallToSuper;

import Oops.FinalKeyword.Test1;

class A1{
    A1(){
        System.out.println("A1 Constructor is called");
        this.m1();
    }
    void m1(){
        System.out.println("m1 inside A1 is called");
    }
}

class B1 extends A1{
    B1(){
        super();
        System.out.println("B1 Constructor is called");
        this.m2();
    }

    void m2() {
        this.m1();
        super.m1();
    }
}
public class Test2 extends B1{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
    }
}
