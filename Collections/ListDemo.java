package Collections;

import java.util.ArrayList;
import java.util.List;

class  Car{
    String brand;

    Car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>();

        users.add("Alias");
        users.add("Charli");
        users.add("Bob");
        users.add("Alias");
        users.add("Charli");
        users.add("Bob");


        for(String user : users){
            System.out.println(user);
        }

        System.out.println("Element using index : " + users.get(2));

        // LIST OF OBJECTS
        Car c1 = new Car("BMW");
        Car c2 = new Car("Toyota");
        Car c3 = new Car("Mercedes Benz");

        List<Car> carList = new ArrayList<>();
        carList.add(c1);
        carList.add(c2);
        carList.add(c3);

        System.out.println("==All Cars==");
        for(Car car : carList){
            System.out.println(car.brand);
        }
    }

}
