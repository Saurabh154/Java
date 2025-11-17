package DataStructure.Strings.InterviewProblem;

import java.util.Scanner;

public class NextVowel {

    public static void main(String[] args) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.print("Enter any character : ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        boolean found = false;

        for (char v : vowels) {
            if (v > ch) {
                System.out.println("next vowel " + v);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Next vowel : a");
        }

    }
}