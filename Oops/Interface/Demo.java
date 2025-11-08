package Oops.Interface;

interface Contract{
    final int i = m1(); //10
    static int m1(){
        System.out.println("method runds");
        return 30;
    }

    private void display(){
        System.out.println("We can write private method ");
    }

    default void show(){
        System.out.println("Default method");
        display();
    }

}

public class Demo implements Contract{

    void m1(){
        Contract.super.show();
    }
    public static void main(String[] args) {
        Contract c = new Demo();
//        c.show();
        Demo d = new Demo();
        d.m1();
//        c.display(); -> cannot access outside from class

    }
}
