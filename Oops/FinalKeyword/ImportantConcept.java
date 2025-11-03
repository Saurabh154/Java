package Oops.FinalKeyword;


class P{
    final int a=10;
    final static int b=20;
    final int i;
    P(){
      i = 20;
    }
    final void display(){
        System.out.println("Final non-static method");
    }
}

final class Q extends P{
    final void add(int a, int b){
        System.out.println("Sum of two numbers : " + (a+b));
    }
    final void add(int a, int b, int c){
        System.out.println("Sum of three numbers : " + (a+b+c));
    }
    final void add(int a, double b){
        System.out.println("Sum of two numbers : " + (a+b));
    }
}

//class R extends Q{} -> can not inherit final class

public class ImportantConcept {

    public static void main(String[] args) {

        Q q = new Q();
        q.add(10,20);
        q.add(12,2.3);
        q.add(10,20,30);

        System.out.println("Parent class properties : " + q.a);
        System.out.println("Parent class static-properties : " + P.b);
        System.out.println("Parent class static methods : ");
        q.display();

        System.out.println(q.i);

    }
}
