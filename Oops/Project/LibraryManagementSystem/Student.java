package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;
public class Student {
    // Class member variables
    private String studentName;
    private String regNum;

    // take input from user
    Scanner input = new Scanner(System.in);

    // Constructor
    public Student()
    {
        System.out.print("Enter Student Name : ");
        this.studentName = input.nextLine();

        System.out.println("Enter Registration Number: ");
        this.regNum = input.nextLine();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }


}
