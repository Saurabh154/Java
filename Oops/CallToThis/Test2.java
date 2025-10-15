package Oops.CallToThis;

class Box{
    int length;
    int breadth;
    int height;

    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box(int d){
        this(d,d,d);
    }

    void display(){
        System.out.println("[Length : " + length + ", " + "Breadth : " + breadth + ", " + "Height : " + height + "]");
    }
}
public class Test2 {
    
    public static void main(String[] args) {
        Box b1 = new Box(5);
        b1.display();
    }
}
