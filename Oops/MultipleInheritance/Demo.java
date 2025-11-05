package Oops.MultipleInheritance;

interface A{
    int x =10;
    void add();
}

interface B{
    void add();
}

abstract class C implements A,B{
    abstract public void add();
}

//class D extends C{
public class Demo {
    public static void main(String[] args) {
//        A a = new C();
//        a.add();

//        B b = new C();
//        b.add();
        System.out.println(C.x);
        System.out.println(A.x);
    }
}
