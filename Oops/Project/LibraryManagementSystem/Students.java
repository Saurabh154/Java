package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;

public class Students {

    // Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
    Student []theStudents = new Student[50];

    public static int count = 0;

    public void addStudent(Student student) {
        for(int i=0; i<count; i++){
            if(student.getRegNum().equalsIgnoreCase(theStudents[i].getRegNum())){
                System.out.println("Student of Reg Num " + student.getRegNum()
                + " is Already Registered.");
                return;
            }
        }

        if(count <= 50){
            theStudents[count] = student;
            count++;
        }

        System.out.println("Student added successfully!!!");
    }


    public void showAllStudents() {
        // Printing student name and
        // corresponding registered number
        System.out.println("===Students Details===");
        for(int i=0; i<count; i++){
            System.out.println("Name : " + theStudents[i].getStudentName());
            System.out.println("Registration Num : " + theStudents[i].getRegNum());
            System.out.println();
        }
    }


}
