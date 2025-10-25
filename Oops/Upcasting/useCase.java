package Oops.Upcasting;

class Car{

}

class Benz extends Car{

}

class Audi extends Car{

}

class Driver{
    void drive(Car c){
        System.out.println("Driving logic executed!!!");
    }
}
public class useCase {
    public static void main(String[] args) {
        Benz b1 = new Benz();
        Audi a1 = new Audi();
        Driver d1 = new Driver();

        d1.drive(b1);
        d1.drive(a1);
    }
}
