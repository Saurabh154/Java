package DataStructure.Strings.InterviewProblem;

public class PalindromeCheck {

    static boolean isPalindrome(String s){

        char []a = s.toCharArray();
        int i = 0;
        int j = a.length-1;

        while(i<j){
            if(a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "maDAUAm";
        s = s.toLowerCase();

        if(isPalindrome(s)){
            System.out.println("Palindrome!!");
        }else{
            System.out.println("Not a Palindrome!!");
        }

    }
}
