package Oops.FinalKeyword;

 class Circle{
    int radius = 10;
}

final class B extends Circle{
    final int i;
    {
        i=20;
    }
}
public class Test1 {
    public static void main(String[] args) {
//        final Circle c1 = new Circle();
//        c1.radius = 20;
//        System.out.println(c1.radius);
//
//        final Circle c2 = new Circle();
//        System.out.println(c2.radius);

        B b1 = new B();
        System.out.println(b1.i);
        System.out.println(b1.radius);

    }
}
