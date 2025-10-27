package Oops.Downcasting;

class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    Dog(){
        System.out.println("Dog Constructor");
    }
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.eat();

        Dog d = (Dog) a; // Downcasting
        d.bark();
    }
}
