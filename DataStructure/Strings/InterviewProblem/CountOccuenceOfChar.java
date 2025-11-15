package DataStructure.Strings.InterviewProblem;

import java.util.Scanner;

public class CountOccuenceOfChar {

    static void solve(String s){

        int []a = new int[26];  // {1 ,0 ,0 ,0}
        for(int i=0; i<26; i++){
            a[i] = 0;
        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = (int)ch - 97;
            a[index]++;
        }

        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                char ch = (char)(i + 97);
                System.out.println(ch +  " -> " + a[i]);
            }
        }
    }

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

        System.out.println("Without replace method");
        solve(s1);
    }
}
