package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;
public class Student {
    // Class member variables
    String studentName;
    String regNum;

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
}
