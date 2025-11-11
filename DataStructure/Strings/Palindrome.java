package DataStructure.Strings;

public class Palindrome {

    static boolean checkPalindrome(String str){
        int i=0; int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "mOOm";

        String str = s.toLowerCase();

        if(checkPalindrome(str)){
            System.out.println("Is a palindrome...");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
