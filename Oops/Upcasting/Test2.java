package Oops.Upcasting;

class D{
    void m1(){
        System.out.println("M1 in Class D");
    }
}
class E extends D{
    void m2(){
        System.out.println("M2 in Class E");
    }
}
class F extends E{
    void m3(){
        System.out.println("M3 in Class F");
    }
}
public class Test2 extends F {
    void m4(){
        System.out.println("M4 in Class Test2");
    }
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.m4(); //✅❌
        t1.m3(); //✅
        t1.m2(); //✅
        t1.m2(); //✅

        System.out.println();

        F f = t1;
//        f.m4(); //❌
        f.m3(); //✅
        f.m2(); //✅
        f.m1(); //✅
    }
}
