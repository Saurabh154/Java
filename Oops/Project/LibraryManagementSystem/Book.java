package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;
public class Book {
    // Class data members
    private int sNo;
    private String bookName;
    private String authorName;
    private int bookQty;
    private int bookQtyCopy;

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

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookQty() {
        return bookQty;
    }

    public void setBookQty(int bookQty) {
        this.bookQty = bookQty;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookQtyCopy() {
        return bookQtyCopy;
    }

    public void setBookQtyCopy(int bookQtyCopy) {
        this.bookQtyCopy = bookQtyCopy;
    }
}
