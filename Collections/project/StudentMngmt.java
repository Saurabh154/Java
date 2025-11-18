package Collections.project;
import java.util.ArrayList;

public class StudentMngmt {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student(100, "Win", 32);
        Student s2 = new Student(101, "SUB", 21);
        Student s3 = new Student(102, "S", 12);
        Student s4 = new Student(103, "A", 23);
        Student s5 = new Student(104, "SD", 25);
        Student s6 = new Student(105, "SUN", 22);
        Student s7 = new Student(106, "SIn", 27);

//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//        list.add(s6);
//        list.add(s7);

        System.out.println("✅ Student List Successfully Populated:");
        System.out.println("----------------------------------------");

        // Iterate over the list and print details
        for (Student student : list) {
            System.out.println("ID: " + student.getStuId() +
                    ", Name: " + student.getName() +
                    ", Age: " + student.getAge());
        }
    }
}