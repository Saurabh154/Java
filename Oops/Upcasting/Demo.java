package Oops.Upcasting;

class D1{
    D1(){
        System.out.println("D1 constructor");
    }
    void m1(){
        System.out.println("Method inside d1");
    }
}

class D2 extends D1{
    D2(){
        System.out.println("D2 constructor");
    }
    void m2(){
        System.out.println("Method inside d2");
    }
}
public class Demo extends D2 {
    Demo(){
        System.out.println("Demo Constructor");
    }

    void m3(){
        System.out.println("Method inside demo");
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        D2 d2 = new D2();
        d2 = d;
        d2.m1();
        d2.m2();
//        d2.m3();
    }
}
