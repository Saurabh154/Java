package Oops.FinalKeyword;

public class A {
    final int j;
    int i;
    A(){
        j = 20;
    }
    public static void main(String[] args) {
        final int i=10;

        System.out.println("Hello print the final value");
        System.out.println(i);

        A a = new A();
        System.out.println(a.j);
        System.out.println(a.i);
    }
}
