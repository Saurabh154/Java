package Oops.Static_Non_Static;

class A {

    {
        System.out.println("Non-Static Block");
    }

    A(){
        this(2);
        System.out.println("Default Constructor");
    }

    A(int a){
        System.out.println("Parameterised Constructor");
    }
    
}

public class Test1 {
    static{
        System.out.println("Static Block inside test1");
    }

    public static void main(String[] args) {
        System.out.println("Main Methods Starts");
        new A();
        new A();
        new A(23);
        System.out.println("Main methods ends");
    }
}
