package Oops.Constructor;

class InnerA {
    int i,j;
    InnerA(){
        System.out.println("Constructor");
    }

    InnerA(int a, int b){

        this();
        i=a;
        j=b;

    }
    
}
public class A {
    public static void main(String[] args) {
        InnerA a1 = new InnerA(10,20);
        System.out.println(a1.i);
        System.out.println(a1.j);
    }
}
