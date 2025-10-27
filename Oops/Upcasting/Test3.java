package Oops.Upcasting;

class P{
    int i;
    P(){
        System.out.println("Constructor in P");
    }
    void m1(){
        System.out.println(i);
    }
}
class Q extends P{
    int j;
    Q(){
        System.out.println("Constructor in Q");
    }
    void m2(){
        System.out.println(j);
    }
}

public class Test3 extends Q{
    int k;
    Test3(){
        System.out.println("Constructor in Test3");
    }
    public static void main(String[] args) {
//        Test3 t3 = new Test3();
//        t3.i = 20;
//        t3.j = 30;
//        t3.k = 40;
//
//        t3.m1();
//        t3.m2();

        Test3 t3 = new Test3();
        P p = t3;
        p.m1();




        System.out.println();
        System.out.println();

//        Q q = t3;
//        q.i = 20;
//        q.j = 40;
//        q.k = 40;
//        q.m1();
//        q.m2();

//        P p = q;

    }
}
