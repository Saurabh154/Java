package Oops.Interface;

interface Contract{

    private void display(){
        System.out.println("We can write private method ");
    }


    default void show(){
        display();
    }
}
public class Demo implements Contract{
    public static void main(String[] args) {
        Contract c = new Demo();
        c.show();

//        c.display(); -> cannot access outside from class

    }
}
