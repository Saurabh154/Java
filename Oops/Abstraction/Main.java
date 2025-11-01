package Oops.Abstraction;


// Why abstract class needs a constructor?

abstract class Shape {
    int sides;

    Shape(int sides) {
        this.sides = sides;
        System.out.println("Shape constructor called with sides : " + this.sides);
    }
}

class Triangle extends Shape {
    Triangle() {
        super(3);  // calls abstract class constructor
        System.out.println("Triangle constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
    }
}

