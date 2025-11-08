package Oops.Encapsulation;

class Student{
    private String name;
    private int id;
    private int age;

    Student(){

    }
    Student(String name, int id, int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


public class Main extends Student{
    public static void main(String[] args) {

        // create a class name student and have 3 private variable name, id ,age
        // and generate getters and setters for each private variables and in test class call
        // all getters and setters with help of inheritance.

        System.out.println("No-Args Constructor");
        Student student = new Student();
        System.out.println(student.getName() + " : " + student.getId() + " : " + student.getAge());

        Student student1 = new Student();
        student1.setName("Saurabh");
        student1.setId(121);
        student1.setAge(20);
        System.out.println(student1.getName() + " : " + student1.getId() + " : " + student1.getAge());

        System.out.println("While creating object i passed the students details");

        Student student2 = new Student("Sagar", 122, 19);
        System.out.println(student2.getName() + " : " + student2.getId() + " : " + student2.getAge());



    }
}
