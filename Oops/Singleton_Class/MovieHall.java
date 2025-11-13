package Oops.Singleton_Class;

public class MovieHall {
    int seats = 50;
    private static MovieHall m = null;
    private MovieHall(){

    }

    public static MovieHall getInstance(){
        if(m == null) {
            m = new MovieHall();
        }
        return m;
    }

    void bookSeats(int n){
        if(n > seats){
            System.out.println("seats are not available");
            return;
        }

        seats = seats - n;
        System.out.println(n + " seats are reserved");
    }
}
