package Oops.Abstraction;

abstract class Car{
    abstract void speed();
}

class BMW extends Car{
    @Override
    void speed(){
        System.out.println("Speed of BMW : 350 km/hr");
    }
}

class Audi extends Car{
    @Override
    void speed(){
        System.out.println("Speed of Audi : 250 km/hr");
    }
}

class Supra extends Car{
    @Override
    void speed(){
        System.out.println("Speed of Supra : 450 km/hr");
    }
}

class CarDriver{
    void drive(Car c){
        System.out.println("Driving the car");
    }
}
public class Test1 {
    public static void main(String[] args) {
        CarDriver d = new CarDriver();
        d.drive(new BMW());
        d.drive(new Audi());
        d.drive(new Supra());
    }
}
