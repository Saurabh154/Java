package DataStructure.Strings.RaveeshSir;

import java.util.Scanner;

public class CountOccuenceOfChar {
    public static void main(String[] args) {

        String s1 = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        s1 = sc.nextLine();

        String s2 = "";
        while(s1.length() > 0){
            char ch = s1.charAt(0);
            s2=s1.replace(ch+"", "" );

            int count = s1.length()-s2.length();
            System.out.println(ch + " - > " + count);
            s1 = s2;
        }
    }
}
