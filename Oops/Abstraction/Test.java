package Oops.Abstraction;


abstract class Animal{
    abstract void makeSound();
}

class Cat extends Animal{
   @Override
    void makeSound(){
        System.out.println("Meow Meow");
    }
}


class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Barking Barking");
    }
}

class Elephant extends Animal{
    @Override
    void makeSound() {
        System.out.println("Trumpet ");
    }
}

class Lion extends Animal{
    @Override
    void makeSound(){
        System.out.println("Roar Roar");
    }
}

class Hospital{
    void vaccination(Animal a){
        a.makeSound();
    }
}


public class Test {

    public static void main(String[] args) {

        Hospital h = new Hospital();  // loose coupling
        h.vaccination(new Cat());
        h.vaccination(new Dog());
        h.vaccination(new Lion());
        h.vaccination(new Elephant());
    }
}
