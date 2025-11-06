package Oops.InstanceOf;

public class B extends A{
    public static void main(String[] args) {
        A a = new B(); //upcasting

        if(a instanceof B){
            B b = (B) a;
            System.out.println("1");
        }
        else if(a instanceof B){
            B b = (B) a;
        }

        System.out.println("Hii...");

    }
}
