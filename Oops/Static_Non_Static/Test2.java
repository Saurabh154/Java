package Oops.Static_Non_Static;

class Car{

    int regNum;
    String color;
    static int num = 1000;

    {
        regNum = num++;
    }
    
    Car(){
        // regNum = num;
        // num++;
        color = "White";
    }
    Car(String c){
        // regNum = num;
        // num++;
        color = c;
    }

    void display(){
        System.out.println("Registration num : " + regNum);
        System.out.println("Color of car : " + color);
    }

}
public class Test2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();

        System.out.println("-------------------");

        Car c2 = new Car("Red");
        c2.display();
    }
}
