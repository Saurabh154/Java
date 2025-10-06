package Oops.Basics;

public class A {
    static int i;
    static int j;

    static void m1(){
       ++i;
    }

    void m2(){
       ++j;
    }

    void display(){
        System.out.println(i +" "+ j);
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        

        m1();
        m1();
        m1();
        m1();
    }
}
