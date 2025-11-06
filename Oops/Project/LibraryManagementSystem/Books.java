package Oops.Project.LibraryManagementSystem;

public class Books {

    Book []theBooks = new Book[50];

    public static int count;

    public int compareBookObjects(Book b1, Book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {
            System.out.println("Book of this Name Already Exists.");
            return 0;
        }

        if (b1.sNo == b2.sNo) {
            System.out.println("Book of this Serial No Already Exists.");
            return 0;
        }
        return 1;
    }


    public void addBook(Book b) {

        for (int i = 0; i < count; i++) {

            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;
        }

        if (count < 50) {
            theBooks[count] = b;
            count++;
        } else {
            System.out.println("No Space to Add More Books.");
        }
    }
}
