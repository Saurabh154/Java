package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Example  — Checked Exception
public class CheckedThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            readFile();  // calling method that declares throws
        } catch (IOException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}


//🧠 Explanation:

//readFile() declares throws IOException

//So, whoever calls it (here main) must handle the exception using try-catch