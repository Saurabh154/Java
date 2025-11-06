package Oops.Encapsulation;

class Student{
    private String name;
    private int roll;

    Student(){

    }
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}


public class Main extends Student{
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Saurabh");
        student1.setRoll(121);
        System.out.println(student1.getName() + " : " + student1.getRoll());


        Student student2 = new Student("Sagar", 122);
        System.out.println(student2.getName() + " : " + student2.getRoll());

    }
}
