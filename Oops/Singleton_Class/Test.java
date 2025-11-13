package Oops.Singleton_Class;

public class Test {
    public static void main(String[] args) {
        MovieHall m1 = MovieHall.getInstance();
        m1.bookSeats(40);

        MovieHall m2 = MovieHall.getInstance();
        m2.bookSeats(30);
    }
}
