package Oops.CallToThis;

class Demo{
    int length;
    int breadth;
    int height;

    Demo(int d){
        length = d;
        breadth = d;
        height = d;
    }

    Demo(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void display(){
        System.out.println("[Length : " + length + ", "+ "Breadth : " + breadth + ", " + "Height : " + height + "]");
    }
}



public class Test1 {
    public static void main(String[] args) {
        Demo d1 = new Demo(0);
        d1.display();
        Demo d2 = new Demo(12,23,23);
        d2.display();
    }
}
