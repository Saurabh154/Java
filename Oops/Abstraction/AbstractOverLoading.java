package Oops.Abstraction;


abstract class A{
    abstract void display();
    abstract void display(String name);
    abstract void display(String course, int month);

    static void m1(){
        System.out.println("No args method");
    }
    static void m1(int i, int j){
        System.out.println("value of i, j : " + i + j);
    }

}
class B extends A {
    @Override
    void display() {
        System.out.println("Welcome to JSpider");
    }

    @Override
    void display(String name) {
        System.out.println("Name of Student : " + name);
    }

    @Override
    void display(String course, int month) {
        System.out.println("Course : " + course);
        System.out.println("Month : " + month);
    }
}

public class AbstractOverLoading{
    public static void main(String[] args) {

        A a = new B();
        a.display();
        a.display("Saurabh");
        a.display("Java Full Stack", 6);
    }
}
