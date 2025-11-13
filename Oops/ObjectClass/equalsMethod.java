package Oops.ObjectClass;

public class equalsMethod {
    public static void main(String[] args) {
        Circle c1 = new Circle(30);
        Circle c2 = new Circle(30);

        System.out.println(c1==c2); // false
        System.out.println(c1.equals(c2));
    }
}
