package Oops.Project.LibraryManagementSystem;

import java.util.Scanner;


public class Library {

    public static void main(String[] args)
    {
        // Creating object of Scanner class
        // to take input from user
        Scanner input = new Scanner(System.in);

        // Displaying menu
        System.out.println(
                "********************Welcome to the Console Library!********************");
        System.out.println(
                "                  Select From The Following Options:               ");
        System.out.println(
                "**********************************************************************");

        // Creating object of books class
        Books books = new Books();

        // Creating object for the students class
        Students students = new Students();

        int choice;
        int searchChoice;


        do{
            books.dispMenu();
            System.out.println("Choose any of one options");
            choice = input.nextInt();

            // Switch case
            switch (choice) {
                case 1:
                    Book book = new Book();
                    books.addBook(book);
                    break;

                case 2:
                    books.upgradeBookQty();
                    break;

                case 3:
                    System.out.println(
                            " press 1 to Search with Book Serial No.");
                    System.out.println(
                            " Press 2 to Search with Book's Author Name.");
                    searchChoice = input.nextInt();

                    switch (searchChoice) {

                        case 1:
                            books.searchBySno();
                            break;
                        case 2:
                            books.searchByAuthorName();
                    }
                    break;

                case 4:
                    books.showAllBooks();
                    break;

                case 5:
                    Student student = new Student();
                    students.addStudent(student);
                    break;
                case 6:
                    students.showAllStudents();
                    break;
                default:
                    System.out.println("THANKS FOR USING....");
            }
        }while(choice != 0);

    }
}