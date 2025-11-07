package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;
public class Book {
    // Class data members
    public int sNo;
    public String bookName;
    public String authorName;
    public int bookQty;
    public int bookQtyCopy;

    // read input from users
    Scanner input = new Scanner(System.in);

    // To add book details
    public Book()
    {
        System.out.print("Enter Serial No of Book: ");
        this.sNo = input.nextInt();
        input.nextLine();

        System.out.print("Enter Book Name: ");
        this.bookName = input.nextLine();

        System.out.print("Enter Author Name: ");
        this.authorName = input.nextLine();

        System.out.print("Enter Quantity of Books: ");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;
    }
}
