package Oops.Constructor;

class Calc {

    int length;
    int breadth;

    Calc(int l, int b){
        length = l;
        breadth = b;
    }

    //copy constructor
    Calc(Calc c){
        length = c.length;
        breadth = c.breadth;
    }

    void display(){
        System.out.println(length);
        System.out.println(breadth);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        
        Calc c = new Calc(10,20);
        // c.display();

        Calc c1 = new Calc(c);
        c1.display();
    }
}
