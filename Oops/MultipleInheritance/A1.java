package Oops.MultipleInheritance;

public class A1 {
   static int x= 10;
}
class B1 extends A1{

}
class C1 {
    public static void main(String[] args) {
        System.out.println(A1.x);
        System.out.println(B1.x);

    }
}
