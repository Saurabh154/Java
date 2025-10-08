package Recursion;

import java.util.Scanner;

public class DigitSum {
    
    static int DigitS(int n) {

        if(n <= 9) return n;

        return n%10 + DigitS(n/10);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        System.out.println("Sumn of the digit is : " + DigitS(n));
        
    }
}
