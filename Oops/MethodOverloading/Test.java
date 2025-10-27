package Oops.MethodOverloading;

class Parent {
    void greet(String name) {
        System.out.println("Hello " + name + ", from Parent class!");
    }
}

class Child extends Parent {
    void greet(String name, int age) {  // different parameters
        System.out.println("Hey " + name + ", you are " + age + " years old!");
    }
}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet("Angel");
        c.greet("Saurabh", 21);
    }
}
