package Oops.Method_Overriding;

class Parent{
    void greet(String name){
        System.out.println("Hello, From super class " + name);
    }
}

class Child extends Parent{
    @Override
    void greet(String name){ // same method name + same parameter
        System.out.println("Hey, From sub class " + name);
    }
}

public class Test {

    public static void main(String[] args) {
        Child c = new Child();
        c.greet("Saurabh"); //always call sub class

        Parent p = new Child();
        p.greet("Angel");
    }
}
