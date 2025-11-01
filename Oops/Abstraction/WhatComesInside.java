package Oops.Abstraction;

abstract class ComesInsideAbstractClass  {

    // 1. Abstract Methods
    abstract void sound();

    // 2. Concrete (non-abstract) Methods
    void eat() {
        System.out.println("Eating...");
    }

    // 3. Constructors : Execute when object of subclass is created.
    ComesInsideAbstractClass() {
        System.out.println("Animal constructor");
    }

    // 4. Instance variables (non-static fields)
    String name = "Dog";
    ComesInsideAbstractClass(String name) {
        this.name = name;
        System.out.println("Name of Animal is : " + this.name);
    }

    // 5. Static variables
    static int count = 0;

    // 6. Static Block  -> Execute First
    static {
        System.out.println("Static block in Animal");
        count = 20;
    }

    // 7. Static Methods
    static void info() {
        System.out.println("This is an Animal class");
    }

    // 8. Final Methods
    final void sleep() {
        System.out.println("Sleeping...");
    }

    // 9. Main method (optional)

}

class Helper extends ComesInsideAbstractClass{

    @Override
    void sound() {
        System.out.println("Must to override the abstract methods");
    }
}

public class WhatComesInside {
    public static void main(String[] args) {

        ComesInsideAbstractClass cm = new Helper(); // upcasting
        System.out.println("1. Calling abstract methods");
        cm.sound();
        System.out.println();

        System.out.println("2. non-abstract methods");
        cm.eat();
        System.out.println();

        System.out.println("3. Constructor automatically via sub-class");
        System.out.println();

        System.out.println("5. static variables : " + ComesInsideAbstractClass.count);
        System.out.println();

        System.out.println("6. Non-Static variable");
        System.out.println("Name of the animal is : " + cm.name);
        System.out.println();

        System.out.println("7. Static Methods");
        ComesInsideAbstractClass.info();
        System.out.println();

        System.out.println("8. Final Methods");
        cm.sleep();


    }
}
